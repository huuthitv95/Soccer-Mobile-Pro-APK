package com.pgl.ssdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ironsource.C11794a2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.pgl.ssdk.al */
/* JADX INFO: loaded from: classes7.dex */
public class C14254al {

    /* JADX INFO: renamed from: a */
    private static volatile C14254al f41247a;

    /* JADX INFO: renamed from: b */
    private Context f41248b;

    /* JADX INFO: renamed from: c */
    private List<Integer> f41249c = new ArrayList();

    private C14254al(Context context) {
        this.f41248b = null;
        this.f41248b = context;
    }

    /* JADX INFO: renamed from: a */
    public static C14254al m42962a(Context context) {
        if (f41247a == null) {
            synchronized (C14254al.class) {
                if (f41247a == null) {
                    f41247a = new C14254al(context);
                }
            }
        }
        return f41247a;
    }

    /* JADX INFO: renamed from: a */
    public void m42963a() {
        int iM42968f = m42968f();
        if (iM42968f == -1) {
            return;
        }
        this.f41249c.add(Integer.valueOf(iM42968f));
        try {
            int size = this.f41249c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f41249c.subList(size - 10, size));
                this.f41249c.clear();
                this.f41249c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public int m42964b() {
        Intent intentRegisterReceiver = this.f41248b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return intentRegisterReceiver.getIntExtra("plugged", 0);
    }

    /* JADX INFO: renamed from: c */
    public int m42965c() {
        Intent intentRegisterReceiver = this.f41248b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return Math.round(((intentRegisterReceiver.getIntExtra("level", 0) / intentRegisterReceiver.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m42966d() {
        if (this.f41249c.size() <= 0) {
            return C11794a2.f26725f;
        }
        List<Integer> list = this.f41249c;
        return String.valueOf(list.get(list.size() - 1).intValue() % 10000);
    }

    /* JADX INFO: renamed from: e */
    public synchronized String m42967e() {
        return new JSONArray((Collection) this.f41249c).toString();
    }

    /* JADX INFO: renamed from: f */
    public int m42968f() {
        int iM42965c;
        int iM42964b = 0;
        try {
            synchronized (this) {
                iM42964b = m42964b();
                iM42965c = m42965c();
            }
            return (iM42964b * 10000) + iM42965c;
        } catch (Exception unused) {
            return iM42964b * 10000;
        }
    }
}
