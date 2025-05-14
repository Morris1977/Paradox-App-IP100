package com.Paradox;

import android.view.View;
import android.widget.AdapterView;

class s implements AdapterView.OnItemLongClickListener {
    final /* synthetic */ DraggableListView a;

    s(DraggableListView draggableListView) {
        this.a = draggableListView;
    }

    public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        return true;
    }
}
