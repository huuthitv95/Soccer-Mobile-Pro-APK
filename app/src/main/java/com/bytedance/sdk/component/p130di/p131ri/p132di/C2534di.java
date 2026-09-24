package com.bytedance.sdk.component.p130di.p131ri.p132di;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.C2578ik;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.di.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2534di implements InterfaceC2535fi {

    /* JADX INFO: renamed from: ri */
    private Context f7030ri;

    public C2534di(Context context) {
        this.f7030ri = context;
    }

    /* JADX INFO: renamed from: lr */
    public static String m9177lr() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p132di.InterfaceC2535fi
    /* JADX INFO: renamed from: ik */
    public void mo9178ik(C2537ka c2537ka) {
        C2578ik.m9467ri(this.f7030ri, "trackurl", "id=?", new String[]{c2537ka.m9206ri()});
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p132di.InterfaceC2535fi
    /* JADX INFO: renamed from: lr */
    public void mo9179lr(C2537ka c2537ka) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", c2537ka.m9206ri());
        contentValues.put("url", c2537ka.m9200lr());
        contentValues.put("replaceholder", Integer.valueOf(c2537ka.m9198ik() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(c2537ka.m9199ka()));
        contentValues.put("error_code", c2537ka.xha());
        contentValues.put("error_msg", c2537ka.jbs());
        contentValues.put("url_type", Integer.valueOf(c2537ka.m9196fi()));
        contentValues.put("ad_id", c2537ka.m9195di());
        C2578ik.m9466ri(this.f7030ri, "trackurl", contentValues, "id=?", new String[]{c2537ka.m9206ri()});
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p132di.InterfaceC2535fi
    /* JADX INFO: renamed from: ri */
    public C2537ka mo9180ri(String str) {
        Cursor cursorM9468ri = C2578ik.m9468ri(this.f7030ri, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (cursorM9468ri != null && cursorM9468ri.moveToFirst()) {
            try {
                String string = cursorM9468ri.getString(cursorM9468ri.getColumnIndex("id"));
                String string2 = cursorM9468ri.getString(cursorM9468ri.getColumnIndex("url"));
                boolean z = cursorM9468ri.getInt(cursorM9468ri.getColumnIndex("replaceholder")) > 0;
                int i = cursorM9468ri.getInt(cursorM9468ri.getColumnIndex("retry"));
                int i2 = cursorM9468ri.getInt(cursorM9468ri.getColumnIndex("url_type"));
                String string3 = cursorM9468ri.getString(cursorM9468ri.getColumnIndex("ad_id"));
                String string4 = cursorM9468ri.getString(cursorM9468ri.getColumnIndex("error_code"));
                String string5 = cursorM9468ri.getString(cursorM9468ri.getColumnIndex("error_msg"));
                C2537ka c2537ka = new C2537ka(string, string2, z, i2, string3);
                c2537ka.m9207ri(i);
                if (!TextUtils.isEmpty(string4)) {
                    c2537ka.m9208ri(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    c2537ka.m9202lr(string5);
                }
                cursorM9468ri.close();
                return c2537ka;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    cursorM9468ri.close();
                    cursorM9468ri = null;
                } catch (Throwable th2) {
                    cursorM9468ri.close();
                    throw th2;
                }
            }
        }
        if (cursorM9468ri != null) {
            cursorM9468ri.close();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p132di.InterfaceC2535fi
    /* JADX INFO: renamed from: ri */
    public List<C2537ka> mo9181ri() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorM9468ri = C2578ik.m9468ri(this.f7030ri, "trackurl", null, null, null, null, null, null);
        if (cursorM9468ri != null) {
            while (cursorM9468ri.moveToNext()) {
                try {
                    String string = cursorM9468ri.getString(cursorM9468ri.getColumnIndex("id"));
                    String string2 = cursorM9468ri.getString(cursorM9468ri.getColumnIndex("url"));
                    boolean z = cursorM9468ri.getInt(cursorM9468ri.getColumnIndex("replaceholder")) > 0;
                    int i = cursorM9468ri.getInt(cursorM9468ri.getColumnIndex("retry"));
                    int i2 = cursorM9468ri.getInt(cursorM9468ri.getColumnIndex("url_type"));
                    String string3 = cursorM9468ri.getString(cursorM9468ri.getColumnIndex("ad_id"));
                    String string4 = cursorM9468ri.getString(cursorM9468ri.getColumnIndex("error_code"));
                    String string5 = cursorM9468ri.getString(cursorM9468ri.getColumnIndex("error_msg"));
                    C2537ka c2537ka = new C2537ka(string, string2, z, i2, string3);
                    c2537ka.m9207ri(i);
                    if (!TextUtils.isEmpty(string4)) {
                        c2537ka.m9208ri(string4);
                    }
                    if (!TextUtils.isEmpty(string5)) {
                        c2537ka.m9202lr(string5);
                    }
                    linkedList.add(c2537ka);
                } catch (Throwable unused) {
                    if (cursorM9468ri != null) {
                        try {
                            cursorM9468ri.close();
                            cursorM9468ri = null;
                        } finally {
                            if (cursorM9468ri != null) {
                                cursorM9468ri.close();
                            }
                        }
                    }
                }
            }
            if (cursorM9468ri != null) {
                cursorM9468ri.close();
                return linkedList;
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p132di.InterfaceC2535fi
    /* JADX INFO: renamed from: ri */
    public void mo9182ri(C2537ka c2537ka) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", c2537ka.m9206ri());
        contentValues.put("url", c2537ka.m9200lr());
        contentValues.put("replaceholder", Integer.valueOf(c2537ka.m9198ik() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(c2537ka.m9199ka()));
        contentValues.put("url_type", Integer.valueOf(c2537ka.m9196fi()));
        contentValues.put("ad_id", c2537ka.m9195di());
        contentValues.put("error_code", c2537ka.xha());
        contentValues.put("error_msg", c2537ka.jbs());
        C2578ik.m9470ri(this.f7030ri, "trackurl", contentValues);
    }
}
