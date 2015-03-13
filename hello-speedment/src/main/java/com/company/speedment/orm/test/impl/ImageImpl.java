/**
 *
 * Copyright (c) 2006-2015, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.company.speedment.orm.test.impl;

import com.company.speedment.orm.test.Image;
import com.company.speedment.orm.test.ImageBuilder;
import java.time.LocalDateTime;
import javax.annotation.Generated;

/**
 * An implementation  representing an entity (for example, a row) in the Table 'Hello Speedment Project.db0.hellospeedment'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class ImageImpl implements ImageBuilder {
    
    private String src;
    private LocalDateTime published;
    private Integer author;
    private String description;
    private String title;
    private Integer id;
    
    public ImageImpl() {
        
    }
    
    public ImageImpl(final Image image) {
        setSrc(image.getSrc());
        setPublished(image.getPublished());
        setAuthor(image.getAuthor());
        setDescription(image.getDescription());
        setTitle(image.getTitle());
        setId(image.getId());
    }
    
    @Override
    public String getSrc() {
        return src;
    }
    
    @Override
    public ImageImpl setSrc(String src) {
        this.src = src;
        return this;
    }
    
    @Override
    public LocalDateTime getPublished() {
        return published;
    }
    
    @Override
    public ImageImpl setPublished(LocalDateTime published) {
        this.published = published;
        return this;
    }
    
    @Override
    public Integer getAuthor() {
        return author;
    }
    
    @Override
    public ImageImpl setAuthor(Integer author) {
        this.author = author;
        return this;
    }
    
    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public ImageImpl setDescription(String description) {
        this.description = description;
        return this;
    }
    
    @Override
    public String getTitle() {
        return title;
    }
    
    @Override
    public ImageImpl setTitle(String title) {
        this.title = title;
        return this;
    }
    
    @Override
    public Integer getId() {
        return id;
    }
    
    @Override
    public ImageImpl setId(Integer id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Image build() {
        return new ImageImpl(this);
    }
}