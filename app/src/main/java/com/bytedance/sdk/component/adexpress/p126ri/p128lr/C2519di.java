package com.bytedance.sdk.component.adexpress.p126ri.p128lr;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2515ik;
import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2517lr;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ri.lr.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2519di {

    /* JADX INFO: renamed from: lr */
    private static volatile C2519di f6994lr = null;

    /* JADX INFO: renamed from: ri */
    public static int f6995ri = 20;

    /* JADX INFO: renamed from: fi */
    private volatile ConcurrentHashMap<String, C2515ik> f6997fi;

    /* JADX INFO: renamed from: ka */
    private final Object f6999ka = new Object();

    /* JADX INFO: renamed from: di */
    private AtomicBoolean f6996di = new AtomicBoolean(false);
    private LruCache<String, C2517lr> xha = new LruCache<String, C2517lr>(f6995ri) { // from class: com.bytedance.sdk.component.adexpress.ri.lr.di.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, C2517lr c2517lr) {
            return 1;
        }
    };

    /* JADX INFO: renamed from: ik */
    private Set<String> f6998ik = Collections.synchronizedSet(new HashSet());

    private C2519di() {
    }

    /* JADX INFO: renamed from: ik */
    public static String m9063ik() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }

    /* JADX INFO: renamed from: ka */
    private void m9064ka(String str) {
        LruCache<String, C2517lr> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.xha) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.f6999ka) {
            this.xha.remove(str);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C2519di m9065ri() {
        if (f6994lr == null) {
            synchronized (C2519di.class) {
                if (f6994lr == null) {
                    f6994lr = new C2519di();
                }
            }
        }
        return f6994lr;
    }

    /* JADX INFO: renamed from: ri */
    public static void m9066ri(int i) {
        f6995ri = i;
    }

    /* JADX INFO: renamed from: ik */
    void m9067ik(String str) {
        C2515ik c2515ik;
        try {
            if (this.f6997fi != null && !this.f6997fi.isEmpty() && (c2515ik = this.f6997fi.get(str)) != null) {
                if (!TextUtils.isEmpty(c2515ik.m9013ri()) && C2531ri.m9163ri().m9164di() != null) {
                    C2531ri.m9163ri().m9164di();
                }
                this.f6997fi.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    List<C2517lr> m9068lr() {
        if (C2531ri.m9163ri().m9168lr() == null) {
            return null;
        }
        boolean z = this.f6996di.get();
        this.f6996di.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorMo9161ri = C2531ri.m9163ri().m9168lr().mo9161ri("template_diff_new", null, null, null, null, null, null);
        if (cursorMo9161ri != null) {
            while (cursorMo9161ri.moveToNext()) {
                try {
                    String string = cursorMo9161ri.getString(cursorMo9161ri.getColumnIndex("rit"));
                    String string2 = cursorMo9161ri.getString(cursorMo9161ri.getColumnIndex("id"));
                    String string3 = cursorMo9161ri.getString(cursorMo9161ri.getColumnIndex("md5"));
                    String string4 = cursorMo9161ri.getString(cursorMo9161ri.getColumnIndex("url"));
                    String string5 = cursorMo9161ri.getString(cursorMo9161ri.getColumnIndex("data"));
                    String string6 = cursorMo9161ri.getString(cursorMo9161ri.getColumnIndex("version"));
                    arrayList.add(new C2517lr().m9032ri(string).m9029lr(string2).m9025ik(string3).m9027ka(string4).m9023fi(string5).m9021di(string6).m9031ri(Long.valueOf(cursorMo9161ri.getLong(cursorMo9161ri.getColumnIndex("update_time")))));
                    synchronized (this.f6999ka) {
                        this.xha.put(string2, (C2517lr) arrayList.get(arrayList.size() - 1));
                    }
                    this.f6998ik.add(string2);
                    if (!z && C2531ri.m9163ri().m9164di() != null) {
                        if (this.f6997fi == null) {
                            this.f6997fi = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.f6997fi.contains(string2)) {
                            this.f6997fi.put(string2, new C2515ik(string, string2, string3));
                        }
                    }
                } catch (Throwable unused) {
                    if (cursorMo9161ri != null) {
                        cursorMo9161ri.close();
                    }
                }
            }
            if (cursorMo9161ri != null) {
                cursorMo9161ri.close();
                return arrayList;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lr */
    Set<String> m9069lr(String str) {
        if (!TextUtils.isEmpty(str) && C2531ri.m9163ri().m9168lr() != null) {
            HashSet hashSet = new HashSet();
            Cursor cursorMo9161ri = C2531ri.m9163ri().m9168lr().mo9161ri("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            try {
                if (cursorMo9161ri != null) {
                    try {
                        if (cursorMo9161ri.moveToFirst()) {
                            do {
                                hashSet.add(cursorMo9161ri.getString(cursorMo9161ri.getColumnIndex("id")));
                            } while (cursorMo9161ri.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e) {
                        Log.e("TmplDbHelper", "", e);
                    }
                }
            } finally {
                cursorMo9161ri.close();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    C2517lr m9070ri(String str) {
        C2517lr c2517lr;
        C2517lr c2517lrM9031ri;
        if (TextUtils.isEmpty(str) || C2531ri.m9163ri().m9168lr() == null) {
            return null;
        }
        synchronized (this.f6999ka) {
            c2517lr = this.xha.get(String.valueOf(str));
        }
        if (c2517lr != null) {
            return c2517lr;
        }
        Cursor cursorMo9161ri = C2531ri.m9163ri().m9168lr().mo9161ri("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (cursorMo9161ri != null) {
            try {
                if (cursorMo9161ri.moveToFirst()) {
                    do {
                        String string = cursorMo9161ri.getString(cursorMo9161ri.getColumnIndex("rit"));
                        String string2 = cursorMo9161ri.getString(cursorMo9161ri.getColumnIndex("id"));
                        String string3 = cursorMo9161ri.getString(cursorMo9161ri.getColumnIndex("md5"));
                        String string4 = cursorMo9161ri.getString(cursorMo9161ri.getColumnIndex("url"));
                        String string5 = cursorMo9161ri.getString(cursorMo9161ri.getColumnIndex("data"));
                        String string6 = cursorMo9161ri.getString(cursorMo9161ri.getColumnIndex("version"));
                        c2517lrM9031ri = new C2517lr().m9032ri(string).m9029lr(string2).m9025ik(string3).m9027ka(string4).m9023fi(string5).m9021di(string6).m9031ri(Long.valueOf(cursorMo9161ri.getLong(cursorMo9161ri.getColumnIndex("update_time"))));
                        synchronized (this.f6999ka) {
                            this.xha.put(string2, c2517lrM9031ri);
                        }
                        this.f6998ik.add(string2);
                    } while (cursorMo9161ri.moveToNext());
                    cursorMo9161ri.close();
                    return c2517lrM9031ri;
                }
            } catch (Throwable unused) {
            }
            cursorMo9161ri.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    void m9071ri(C2517lr c2517lr, boolean z) {
        if (c2517lr == null || C2531ri.m9163ri().m9168lr() == null || TextUtils.isEmpty(c2517lr.m9030lr())) {
            return;
        }
        Cursor cursorMo9161ri = C2531ri.m9163ri().m9168lr().mo9161ri("template_diff_new", null, "id=?", new String[]{c2517lr.m9030lr()}, null, null, null);
        boolean z2 = cursorMo9161ri != null && cursorMo9161ri.getCount() > 0;
        String string = null;
        if (cursorMo9161ri != null) {
            try {
                string = cursorMo9161ri.moveToFirst() ? cursorMo9161ri.getString(cursorMo9161ri.getColumnIndex("rit")) : null;
                cursorMo9161ri.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", c2517lr.m9033ri());
        contentValues.put("id", c2517lr.m9030lr());
        contentValues.put("md5", c2517lr.m9026ik());
        contentValues.put("url", c2517lr.m9028ka());
        contentValues.put("data", c2517lr.m9024fi());
        contentValues.put("version", c2517lr.m9022di());
        contentValues.put("update_time", c2517lr.xha());
        if (z2) {
            C2531ri.m9163ri().m9168lr().mo9159ri("template_diff_new", contentValues, "id=?", new String[]{c2517lr.m9030lr()});
        } else {
            C2531ri.m9163ri().m9168lr().mo9162ri("template_diff_new", contentValues);
        }
        synchronized (this.f6999ka) {
            this.xha.put(c2517lr.m9030lr(), c2517lr);
        }
        this.f6998ik.add(c2517lr.m9030lr());
        if (z) {
            return;
        }
        try {
            if (C2531ri.m9163ri().m9164di() == null) {
                return;
            }
            if (this.f6997fi == null) {
                this.f6997fi = new ConcurrentHashMap<>();
            }
            C2515ik c2515ik = new C2515ik(c2517lr.m9033ri(), c2517lr.m9030lr(), c2517lr.m9026ik());
            this.f6997fi.put(c2517lr.m9030lr(), c2515ik);
            if (string != null) {
                C2531ri.m9163ri().m9164di();
                c2515ik.m9012lr();
            }
            C2531ri.m9163ri().m9164di();
            c2517lr.m9033ri();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: ri */
    void m9072ri(Set<String> set) {
        if (set == null || set.isEmpty() || C2531ri.m9163ri().m9168lr() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                m9064ka(strArr[i]);
                C2531ri.m9163ri().m9168lr().mo9160ri("template_diff_new", "id=?", new String[]{strArr[i]});
                m9067ik(strArr[i]);
            }
        }
    }
}
