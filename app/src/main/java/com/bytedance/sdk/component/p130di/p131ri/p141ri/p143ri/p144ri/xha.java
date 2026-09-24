package com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.p134ik.C2547lr;
import com.bytedance.sdk.component.p130di.p131ri.p134ik.C2548ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p136lr.C2551ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p137ri.C2554ri;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.C2557ka;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.C2562ri;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.C2578ik;
import com.bytedance.sdk.component.p130di.p131ri.xha.C2588ri;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends AbstractC2584ik {

    /* JADX INFO: renamed from: ik */
    private C2551ri f7232ik;

    /* JADX INFO: renamed from: ri */
    protected List<String> f7233ri;

    public xha(Context context, C2551ri c2551ri) {
        super(context);
        this.f7233ri = new ArrayList();
        this.f7232ik = c2551ri;
        if (c2551ri == null) {
            this.f7232ik = C2551ri.m9295ik();
        }
    }

    /* JADX INFO: renamed from: ik */
    public static String m9513ik(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    /* JADX INFO: renamed from: lr */
    private void m9514lr(int i, long j) {
        C2578ik.m9467ri(m9495fi(), mo9487lr(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
    }

    /* JADX INFO: renamed from: ri */
    private static String m9515ri(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }

    /* JADX INFO: renamed from: ri */
    private static String m9516ri(String str, List<?> list, int i, boolean z) {
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int iMin = Math.min(i, 1000);
        int size = list.size();
        int i2 = size % iMin == 0 ? size / iMin : (size / iMin) + 1;
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * iMin;
            String strM9515ri = m9515ri(TextUtils.join("','", list.subList(i4, Math.min(i4 + iMin, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            sb.append(str);
            sb.append(str2);
            sb.append("('");
            sb.append(strM9515ri);
            sb.append("')");
        }
        return m9515ri(sb.toString(), str + str2 + "('')");
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.AbstractC2584ik
    /* JADX INFO: renamed from: di */
    protected long mo9494di() {
        return C2588ri.m9551lr();
    }

    /* JADX INFO: renamed from: ik */
    public byte mo9486ik() {
        return (byte) 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x0023: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0023: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: ka */
    public int m9517ka() {
        Cursor cursorM9468ri;
        int i = 0;
        try {
            cursorM9468ri = C2578ik.m9468ri(m9495fi(), mo9487lr(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorM9468ri != null) {
                try {
                    cursorM9468ri.moveToFirst();
                    i = cursorM9468ri.getInt(0);
                } catch (Throwable unused) {
                    if (cursorM9468ri != null) {
                        try {
                            cursorM9468ri.close();
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            if (cursorM9468ri != null) {
                cursorM9468ri.close();
            }
        } catch (Throwable unused3) {
            cursorM9468ri = null;
        }
        return i;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.p144ri.AbstractC2584ik
    /* JADX INFO: renamed from: lr */
    public String mo9487lr() {
        return com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().m9530ik().mo9456ka();
    }

    /* JADX INFO: renamed from: lr */
    public List<InterfaceC2552ri> m9518lr(String str) {
        C2551ri c2551ri = this.f7232ik;
        return c2551ri == null ? new ArrayList() : m9520ri(c2551ri.m9297lr(), str);
    }

    /* JADX INFO: renamed from: lr */
    public void m9519lr(List<InterfaceC2552ri> list) {
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
        C2578ik.m9469ri(m9495fi(), "DELETE FROM " + mo9487lr() + " WHERE " + m9516ri("id", linkedList, 1000, true));
        m9496ik(linkedList);
    }

    /* JADX INFO: renamed from: ri */
    public byte mo9488ri() {
        return (byte) 1;
    }

    /* JADX INFO: renamed from: ri */
    public List<InterfaceC2552ri> m9520ri(int i, String str) {
        long jM9376ri = C2562ri.m9376ri(i, m9495fi());
        if (jM9376ri <= 0) {
            jM9376ri = 1;
        } else if (jM9376ri > 100) {
            jM9376ri = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.f7233ri.clear();
        Cursor cursorM9468ri = C2578ik.m9468ri(m9495fi(), mo9487lr(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + jM9376ri);
        if (cursorM9468ri != null) {
            while (cursorM9468ri.moveToNext()) {
                try {
                    try {
                        String string = cursorM9468ri.getString(cursorM9468ri.getColumnIndex("id"));
                        String string2 = cursorM9468ri.getString(cursorM9468ri.getColumnIndex("value"));
                        if (cursorM9468ri.getInt(cursorM9468ri.getColumnIndex("encrypt")) == 1) {
                            string2 = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di().m9549vr().mo9225ri(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.f7233ri.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            C2554ri c2554ri = new C2554ri(string, new JSONObject(string2));
                            c2554ri.m9302ik(mo9486ik());
                            c2554ri.m9303lr(mo9488ri());
                            arrayList.add(c2554ri);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    if (cursorM9468ri != null) {
                        try {
                            cursorM9468ri.close();
                            if (!this.f7233ri.isEmpty()) {
                                m9522ri(this.f7233ri);
                                this.f7233ri.clear();
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    public void m9521ri(int i, long j) {
        m9514lr(i, j);
    }

    /* JADX INFO: renamed from: ri */
    protected void m9522ri(List<String> list) {
        mo9487lr();
        list.size();
        C2578ik.m9469ri(m9495fi(), "DELETE FROM " + mo9487lr() + " WHERE " + m9516ri("id", list, 1000, true));
        C2547lr.m9244ri(C2557ka.f7082ka.m9402qh(), list.size());
        m9496ik(list);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m9523ri(int i) {
        return this.f7232ik != null && m9517ka() >= this.f7232ik.m9298ri();
    }
}
