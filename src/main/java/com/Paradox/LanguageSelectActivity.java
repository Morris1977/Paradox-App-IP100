package com.Paradox;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.androidip.R;

import java.util.Locale;

public class LanguageSelectActivity extends Activity {
    /* access modifiers changed from: private */
    public String a = "";
    private AdapterView.OnItemClickListener b = new ax(this);

    /* access modifiers changed from: private */
    public void a(ay ayVar) {
        MyApplication.abo(ayVar.a);
        Intent launchIntentForPackage = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
        launchIntentForPackage.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(launchIntentForPackage);
    }

    @SuppressLint("ResourceType")
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean requestWindowFeature = requestWindowFeature(7);
        setContentView(R.layout.language_select);
        if (requestWindowFeature) {
            getWindow().setFeatureInt(7, R.layout.titlebar);
            ((TextView) findViewById(R.id.wtTitle1)).setText(R.string.Language);
        }
        this.a = MyApplication.b();
        az azVar = new az(this, this, R.layout.language_item_row, new ay[]{new ay(this, Locale.getDefault().toString().substring(0, 2), "Default", "(Default)"), new ay(this, "cs", "Czech", "Česká"), new ay(this, "de", "German", "Deutsch"), new ay(this, "el", "Greek", "ελληνικά"), new ay(this, "en", "English", "English"), new ay(this, "es", "Spanish", "Español"), new ay(this, "et", "Estonian", "Eestis"), new ay(this, "fr", "French", "Français"), new ay(this, "he", "Hebrew", "עברית"), new ay(this, "iw", "Hebrew", "עברית"), new ay(this, "hu", "Hungarian", "Magyar"), new ay(this, "it", "Italian", "Italiano"), new ay(this, "mk", "Macedonian", "Македонска"), new ay(this, "ms", "Malay", "Melayu"), new ay(this, "nl", "Dutch", "Nederlands"), new ay(this, "pl", "Polish", "Polski"), new ay(this, "pt", "Portuguese", "Português"), new ay(this, "ro", "Romanian", "Română"), new ay(this, "ru", "Russian", "Pусский"), new ay(this, "sk", "Slovak", "Slovenských"), new ay(this, "sl", "Sloven", "Slovenski"), new ay(this, "sq", "Albanian", "Shqiptar"), new ay(this, "sr", "Serbian", "Cрпски"), new ay(this, "sv", "Swedish", "Svenskt"), new ay(this, "tr", "Turkish", "Türkçe"), new ay(this, "zh-rCN", "Chinese-Simplified", "中国的"), new ay(this, "lt", "Luthanian", "Lietuvos"), new ay(this, "bg", "Bulgarian", "български"), new ay(this, "hr", "Croation", "Hrvatska")});
        ListView listView = (ListView) findViewById(R.id.lvLanguageList);
        listView.setAdapter(azVar);
        listView.setOnItemClickListener(this.b);
    }
}
