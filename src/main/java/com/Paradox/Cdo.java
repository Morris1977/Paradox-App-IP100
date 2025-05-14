package com.Paradox;

import android.view.ContextMenu;
import android.view.View;
import android.widget.AdapterView;

import com.androidip.R;

/* renamed from: com.Paradox.do  reason: invalid class name */
class Cdo implements View.OnCreateContextMenuListener {
    final /* synthetic */ ParadoxActivity a;

    Cdo(ParadoxActivity paradoxActivity) {
        this.a = paradoxActivity;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.a.getMenuInflater().inflate(R.menu.site_entry, contextMenu);
        Site site = (Site) this.a.nprova.getItem((int) ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).id);
        if (site.o() == eb.ADD_BUTTON) {
            contextMenu.setHeaderTitle("");
            contextMenu.findItem(R.id.itemEdit).setVisible(false);
            contextMenu.findItem(R.id.itemDelete).setVisible(false);
            contextMenu.findItem(R.id.itemRememberMe).setVisible(false);
            contextMenu.findItem(R.id.itemConnect).setVisible(false);
        } else {
            contextMenu.setHeaderTitle(site.f());
            contextMenu.findItem(R.id.itemConnect).setVisible(site.o() == eb.ENTRY_READY);
            contextMenu.findItem(R.id.itemRememberMe).setChecked(site.j());
        }
        if (this.a.nprova.getCount() >= ParadoxActivity.j) {
            contextMenu.findItem(R.id.itemNewSite).setVisible(false);
        }
    }
}
