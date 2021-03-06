package br.com.agateownz.foodsocial.modules.post.model;

import br.com.agateownz.foodsocial.modules.hashtag.model.Hashtag;
import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class PostHashtagId implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", foreignKey = @ForeignKey(name = "fk_post_hashtag_post_id"))
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hashtag_id", foreignKey = @ForeignKey(name = "fk_post_hashtag_hashtag_id"))
    private Hashtag hashtag;
}
