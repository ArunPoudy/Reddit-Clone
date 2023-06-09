package com.arun.springredditclone.model;

public enum VoteType {
    UPVOTE(1), DOWNVOTE(-1);

    private final int direction;

    VoteType(int direction) {
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }
}