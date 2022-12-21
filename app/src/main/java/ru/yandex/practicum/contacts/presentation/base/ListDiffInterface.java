package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <MyUi>{
    boolean theSameAs(MyUi newItem);
    boolean equals(Object o);
}
