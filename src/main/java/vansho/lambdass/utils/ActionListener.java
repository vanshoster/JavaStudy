package vansho.lambdass.utils;

import java.awt.event.ActionEvent;

public interface ActionListener {
    void actionEvent1(ActionEvent event);
    default void actionEvent2() {};
}
