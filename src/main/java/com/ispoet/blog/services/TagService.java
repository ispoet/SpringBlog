package com.ispoet.blog.services;

import com.ispoet.blog.repositories.TagRepository;
import com.ispoet.blog.models.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Raysmond
 */
@Service
public class TagService {
    private TagRepository tagRepository;

    @Autowired
    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public Tag findOrCreateByName(String name) {
        Tag tag = tagRepository.findByName(name);
        if (tag == null) {
            tag = tagRepository.save(new Tag(name));
        }
        return tag;
    }

    public Tag getTag(String tagName) {
        return tagRepository.findByName(tagName);
    }

    public void deleteTag(Tag tag) {
        tagRepository.delete(tag);
    }

    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }

}
