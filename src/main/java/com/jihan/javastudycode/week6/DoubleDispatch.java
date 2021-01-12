package com.jihan.javastudycode.week6;

import java.util.Arrays;
import java.util.List;

public class DoubleDispatch {
    interface Post { void postOn(SNS sns); }
    static class Text implements Post {

        @Override
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }

    static class Picture implements Post {

        @Override
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }

    interface SNS {
        void post(Text text);
        void post(Picture picture);
    }

    static class Facebook implements SNS {
        @Override
        public void post(Text text) {
            System.out.println("text -> facebook");
        }

        @Override
        public void post(Picture picture) {
            System.out.println("picture -> facebook");
        }
    };

    static class Twitter implements SNS {
        @Override
        public void post(Text text) {
            System.out.println("text -> twitter");
        }

        @Override
        public void post(Picture picture) {
            System.out.println("picture -> twitter");
        }
    };

    static class Instagram implements SNS {
        @Override
        public void post(Text text) {
            System.out.println("text -> instagram");
        }

        @Override
        public void post(Picture picture) {
            System.out.println("picture -> instagram");
        }
    };

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new Facebook(), new Twitter(), new Instagram());

        posts.forEach(p -> sns.forEach(p::postOn));
    }

}
