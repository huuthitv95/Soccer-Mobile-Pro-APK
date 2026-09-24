package com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi;
import com.bytedance.sdk.component.p130di.p131ri.p134ik.C2547lr;
import com.bytedance.sdk.component.p130di.p131ri.p134ik.C2548ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p136lr.C2551ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p137ri.C2554ri;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.C2557ka;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.C2562ri;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.C2578ik;
import com.bytedance.sdk.component.p130di.p131ri.xha;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.ri.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2587ri extends AbstractC2584ik {

    /* JADX INFO: renamed from: ik */
    private final Context f7229ik;

    /* JADX INFO: renamed from: ka */
    private C2551ri f7230ka;

    /* JADX INFO: renamed from: ri */
    protected List<String> f7231ri;

    public C2587ri(Context context, C2551ri c2551ri) {
        super(context);
        this.f7231ri = new ArrayList();
        this.f7229ik = context;
        this.f7230ka = c2551ri;
        if (c2551ri == null) {
            this.f7230ka = C2551ri.m9295ik();
        }
    }

    /* JADX INFO: renamed from: lr */
    public static String m9502lr(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    /* JADX INFO: renamed from: lr */
    private void m9503lr(int i, long j) {
        if (j > 0 || i > 0) {
            C2578ik.m9467ri(m9495fi(), mo9487lr(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
            mo9487lr();
        }
    }

    /* JADX INFO: renamed from: ri */
    private static String m9504ri(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }

    /* JADX INFO: renamed from: ri */
    private static String m9505ri(String str, List<?> list, int i, boolean z) {
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int iMin = Math.min(i, 1000);
        int size = list.size();
        int i2 = size % iMin == 0 ? size / iMin : (size / iMin) + 1;
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * iMin;
            String strM9504ri = m9504ri(TextUtils.join("','", list.subList(i4, Math.min(i4 + iMin, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            sb.append(str);
            sb.append(str2);
            sb.append("('");
            sb.append(strM9504ri);
            sb.append("')");
        }
        return m9504ri(sb.toString(), str + str2 + "('')");
    }

    /* JADX INFO: renamed from: ik */
    public byte mo9500ik() {
        return (byte) 2;
    }

    /* JADX INFO: renamed from: ka */
    public byte mo9501ka() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.AbstractC2584ik
    /* JADX INFO: renamed from: lr */
    public String mo9487lr() {
        InterfaceC2566fi interfaceC2566fiM9530ik = xha.m9524di().m9530ik();
        if (interfaceC2566fiM9530ik != null) {
            return interfaceC2566fiM9530ik.mo9457lr();
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    public void m9506lr(List<InterfaceC2552ri> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (InterfaceC2552ri interfaceC2552ri : list) {
            linkedList.add(interfaceC2552ri.mo9284ik());
            C2548ri.m9259qt(interfaceC2552ri);
        }
        mo9487lr();
        linkedList.size();
        C2578ik.m9469ri(m9495fi(), "DELETE FROM " + mo9487lr() + " WHERE " + m9505ri("id", linkedList, 1000, true));
        m9496ik(linkedList);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0024 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r0 r1
  0x0024: PHI (r0v3 int) = (r0v0 int), (r0v5 int) binds: [B:13:0x002f, B:6:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0024: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:13:0x002f, B:6:0x0022] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: ri */
    public int m9507ri() {
        Cursor cursorM9468ri = null;
        int i = 0;
        try {
            cursorM9468ri = C2578ik.m9468ri(m9495fi(), mo9487lr(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorM9468ri != null) {
                cursorM9468ri.moveToFirst();
                i = cursorM9468ri.getInt(0);
            }
        } catch (Exception unused) {
        } finally {
            if (cursorM9468ri != null) {
                try {
                    cursorM9468ri.close();
                } catch (Exception unused2) {
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ri */
    public List<InterfaceC2552ri> m9508ri(int i, String str) {
        String str2;
        String[] strArr;
        String str3;
        String str4;
        Cursor cursorM9468ri;
        long jM9376ri = C2562ri.m9376ri(i, m9495fi());
        mo9487lr();
        if (jM9376ri <= 0) {
            jM9376ri = 1;
        } else if (jM9376ri > 100) {
            jM9376ri = 100;
        }
        String str5 = str + " DESC limit " + jM9376ri;
        ArrayList arrayList = new ArrayList();
        this.f7231ri.clear();
        long jSlm = xha.m9524di().slm();
        if (jSlm > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jSlm)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (C2548ri.m9254ka() && mo9501ka() == 3) {
            str3 = "value";
            str4 = "id";
            cursorM9468ri = C2578ik.m9468ri(m9495fi(), mo9487lr(), new String[]{"id", "value", "encrypt", "channel"}, str2, strArr, null, null, str5);
        } else {
            str3 = "value";
            str4 = "id";
            cursorM9468ri = C2578ik.m9468ri(m9495fi(), mo9487lr(), new String[]{str4, str3, "encrypt"}, str2, strArr, null, null, str5);
        }
        Cursor cursor = cursorM9468ri;
        if (cursor != null) {
            try {
                InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str4));
                        String string2 = cursor.getString(cursor.getColumnIndex(str3));
                        int i2 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i3 = (C2548ri.m9254ka() && mo9501ka() == 3) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i2 == 1) {
                            try {
                                string2 = interfaceC2540fiM9549vr.mo9225ri(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.f7231ri.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            C2554ri c2554ri = new C2554ri(string, jSONObject);
                            c2554ri.m9303lr(mo9501ka());
                            c2554ri.m9302ik(mo9500ik());
                            if (C2548ri.m9254ka() && mo9501ka() == 3) {
                                c2554ri.m9306ri(i3);
                            }
                            C2548ri.m9268ri(jSONObject, c2554ri);
                            arrayList.add(c2554ri);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (cursor != null) {
                    try {
                        cursor.close();
                        if (!this.f7231ri.isEmpty()) {
                            m9511ri(this.f7231ri);
                            this.f7231ri.clear();
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th3) {
                if (cursor != null) {
                    try {
                        cursor.close();
                        if (!this.f7231ri.isEmpty()) {
                            m9511ri(this.f7231ri);
                            this.f7231ri.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
                throw th3;
            }
        }
        mo9487lr();
        arrayList.size();
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    public List<InterfaceC2552ri> m9509ri(String str) {
        C2551ri c2551ri = this.f7230ka;
        return c2551ri == null ? new ArrayList() : m9508ri(c2551ri.m9297lr(), str);
    }

    /* JADX INFO: renamed from: ri */
    public void m9510ri(int i, long j) {
        m9503lr(i, j);
    }

    /* JADX INFO: renamed from: ri */
    protected void m9511ri(List<String> list) {
        mo9487lr();
        list.size();
        C2578ik.m9469ri(m9495fi(), "DELETE FROM " + mo9487lr() + " WHERE " + m9505ri("id", list, 1000, true));
        C2547lr.m9244ri(C2557ka.f7082ka.m9402qh(), list.size());
        m9496ik(list);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m9512ri(int i) {
        if (this.f7230ka == null) {
            return false;
        }
        int iM9507ri = m9507ri();
        int iM9298ri = this.f7230ka.m9298ri();
        mo9487lr();
        if (C2548ri.m9251ik() && (i == 1 || i == 2)) {
            return iM9507ri > 0;
        }
        return iM9507ri >= iM9298ri;
    }
}
