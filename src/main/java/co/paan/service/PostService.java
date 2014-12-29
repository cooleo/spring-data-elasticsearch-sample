package co.paan.service;

import co.paan.entities.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * Created by hungnguyen on 12/28/14.
 */
public interface PostService {
    Post save(Post post);
    Post findOne(String id);
    Iterable<Post> findAll();

    Page<Post> findByTagsName(String tagName, PageRequest pageRequest);
}
