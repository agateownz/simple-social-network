package br.com.agateownz.foodsocial.modules.post.model;

import br.com.agateownz.foodsocial.modules.content.model.Content;
import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class PostContentId implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", foreignKey = @ForeignKey(name = "fk_post_content_post_id"))
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id", foreignKey = @ForeignKey(name = "fk_post_content_content_id"))
    private Content content;
}
