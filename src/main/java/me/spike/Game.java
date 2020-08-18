package me.spike;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@TypeDef(
        name = "list-array",
        typeClass = ListArrayType.class
)
public class Game {

    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "game_id_seq")
    @SequenceGenerator(name = "game_id_seq", sequenceName = "game_id_seq", allocationSize = 1)
    private int id;

    private String name;

    @Type(type = "list-array")
    private List<String> tags;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
