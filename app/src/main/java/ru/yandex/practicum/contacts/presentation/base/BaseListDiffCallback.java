package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<MyUi extends ListDiffInterface<MyUi>> extends DiffUtil.ItemCallback<MyUi>{
    @Override
    public boolean areItemsTheSame(@NonNull MyUi oldItem, @NonNull MyUi newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull MyUi oldItem, @NonNull MyUi newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull MyUi oldItem, @NonNull MyUi newItem) {
        return newItem;
    }
}
