package SinglyLinkedList.SocialMediaFriendConnections;

import java.util.ArrayList;
import java.util.List;

public class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }

    @Override
    public String toString() {
        return "UserID: " + userId + ", Name: " + name + ", Age: " + age + ", Friends: " + friendIds;
    }
}
