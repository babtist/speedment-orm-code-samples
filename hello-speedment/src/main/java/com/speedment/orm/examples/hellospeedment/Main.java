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
package com.speedment.orm.examples.hellospeedment;

import com.company.speedment.orm.test.hello.HelloApplication;
import com.company.speedment.orm.test.hello.db0.hellospeedment.image.Image;
import com.company.speedment.orm.test.hello.db0.hellospeedment.image.ImageManager;
import com.speedment.orm.core.lifecycle.Lifecyclable;
import java.sql.Timestamp;

/**
 *
 * @author Emil Forslund
 */
public class Main {

    public static void main(String[] args) {
        Lifecyclable<HelloApplication> c = new HelloApplication()
                .setPreInitialize(() -> {
                    System.out.println("Pre init");
                })
                .setPreResolve(() -> {
                    System.out.println("Pre resolve");
                })
                .setPreStart(() -> {
                    System.out.println("Pre start");
                })
                .setPreStop(() -> {
                    System.out.println("Pre stop");
                })
                .setPostStop(() -> {
                    System.out.println("Post stop");
                })
                .start();

        Image img = ImageManager.get().builder()
                .setAuthor(3)
                .setTitle("An image")
                .setDescription("A really nice image.")
                //.setPublished(LocalDateTime.now())
                .setPublished(now())
                .setSrc("http://www.example.com/img.jpg");

        System.out.println(img);

        ImageManager.get().persist(img);

        ImageManager.get().stream().forEachOrdered(System.out::println);

//        long bilderAvFem = ImageManager.get().stream().filter(i -> i.getAuthor() == 5).count();
//        System.out.println(bilderAvFem);
        c.stop();

    }

    private static Timestamp now() {
        return new Timestamp(System.currentTimeMillis());
    }

}
