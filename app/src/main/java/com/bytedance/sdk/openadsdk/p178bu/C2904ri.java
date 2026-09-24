package com.bytedance.sdk.openadsdk.p178bu;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.p230di.C3367ri;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.bu.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2904ri implements Comparable<C2904ri> {
    private long bgr;

    /* JADX INFO: renamed from: fi */
    private int f8690fi;

    /* JADX INFO: renamed from: ik */
    private int f8691ik;

    /* JADX INFO: renamed from: lr */
    private final String f8693lr;
    private int xha;

    /* JADX INFO: renamed from: ri */
    private final ArrayList<Long> f8696ri = new ArrayList<>();

    /* JADX INFO: renamed from: ka */
    private final ArrayList<Long> f8692ka = new ArrayList<>();

    /* JADX INFO: renamed from: di */
    private final ArrayList<Long> f8689di = new ArrayList<>();

    /* JADX INFO: renamed from: mj */
    private final ArrayList<Long> f8694mj = new ArrayList<>();
    private final HashMap<String, C2903lr> jbs = new HashMap<>();

    /* JADX INFO: renamed from: qt */
    private int f8695qt = 0;

    /* JADX INFO: renamed from: sf */
    private int f8697sf = 0;

    /* JADX INFO: renamed from: co */
    private final HashMap<String, C2903lr> f8688co = new HashMap<>();

    /* JADX INFO: renamed from: aw */
    private int f8687aw = 0;

    /* JADX INFO: renamed from: vr */
    private final ArrayList<String> f8698vr = new ArrayList<>();

    public C2904ri(String str) {
        this.f8693lr = str;
    }

    /* JADX INFO: renamed from: lr */
    private void m11189lr(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        int[] iArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] iArrM15201co = C3367ri.m15193ri().m15201co();
        if (iArrM15201co != null) {
            int i4 = 0;
            while (i4 < iArrM15201co.length) {
                int i5 = iArrM15201co[i4];
                long j = 60000;
                long j2 = jElapsedRealtime - (((long) i5) * 60000);
                Iterator<String> it = this.f8688co.keySet().iterator();
                long j3 = 0;
                while (it.hasNext()) {
                    long j4 = j;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    C2903lr c2903lr = this.f8688co.get(next);
                    if (c2903lr != null) {
                        long jM11187ri = c2903lr.m11187ri(j2, jElapsedRealtime);
                        j3 += jM11187ri;
                        if (jM11187ri <= 0 && i4 == iArrM15201co.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j = j4;
                }
                if (j3 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i5)), j3);
                    iArr = iArrM15201co;
                    long jOptInt = ((long) jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i5)))) + j3;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i5)), jOptInt);
                    }
                } else {
                    iArr = iArrM15201co;
                }
                i4++;
                iArrM15201co = iArr;
            }
        }
        int[] iArrM15199aw = C3367ri.m15193ri().m15199aw();
        if (iArrM15199aw != null) {
            int i6 = 0;
            while (i6 < iArrM15199aw.length) {
                int i7 = iArrM15199aw[i6];
                long j5 = jElapsedRealtime - (((long) i7) * 60000);
                long j6 = 0;
                int i8 = 0;
                for (String str : this.jbs.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i9 = i7;
                    C2903lr c2903lr2 = this.jbs.get(str);
                    if (c2903lr2 != null) {
                        long jM11187ri2 = c2903lr2.m11187ri(j5, jElapsedRealtime);
                        j6 += jM11187ri2;
                        if (jM11187ri2 > 20000) {
                            i8++;
                        }
                        if (jM11187ri2 <= 0 && i6 == iArrM15199aw.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i7 = i9;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i10 = i7;
                if (j6 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i10)), j6);
                    long jOptInt2 = ((long) jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i10)))) + j6;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i10)), jOptInt2);
                    }
                }
                if (i8 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i10)), i8);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i10))) + i8;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i10)), iOptInt);
                    }
                }
                i6++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.f8688co.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.jbs.remove((String) it4.next());
            }
        }
        if (C3367ri.m15193ri().m15211vr() && (i3 = this.f8695qt) != 0) {
            jSONObject.put("v_stay_t_s", i3);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.f8695qt;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (C3367ri.m15193ri().bgr() && (i2 = this.f8687aw) != 0) {
            jSONObject.put("lp_stay_t_s", i2);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.f8687aw;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!C3367ri.m15193ri().m15200bu() || (i = this.f8697sf) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.f8697sf;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m11190ri(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i = 0;
        for (int i2 : iArr) {
            long j2 = j - (((long) i2) * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j2) {
                i++;
                size--;
            }
            if (i != 0) {
                jSONObject.put(str + i2, i);
                int iOptInt = jSONObject2.optInt(str + i2) + i;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i2, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m11191ri(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m11190ri("show_c_", jSONObject, this.f8696ri, C3367ri.m15193ri().jbs(), jElapsedRealtime, jSONObject2);
        m11190ri("click_c_", jSONObject, this.f8692ka, C3367ri.m15193ri().m15209qt(), jElapsedRealtime, jSONObject2);
        m11190ri("v_play_c_", jSONObject, this.f8689di, C3367ri.m15193ri().m15210sf(), jElapsedRealtime, jSONObject2);
        m11190ri("dislike_c_", jSONObject, this.f8694mj, C3367ri.m15193ri().slm(), jElapsedRealtime, jSONObject2);
        if (C3367ri.m15193ri().m15202di() && (i3 = this.f8691ik) != 0) {
            jSONObject.put("show_c_s", i3);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.f8691ik;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (C3367ri.m15193ri().xha() && (i2 = this.f8690fi) != 0) {
            jSONObject.put("click_c_s", i2);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.f8690fi;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!C3367ri.m15193ri().m15207mj() || (i = this.xha) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i);
        int iOptInt3 = jSONObject2.optInt("v_play_c_s") + this.xha;
        if (iOptInt3 != 0) {
            jSONObject2.put("v_play_c_s", iOptInt3);
        }
    }

    /* JADX INFO: renamed from: lr */
    public String m11192lr() {
        return this.f8693lr;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2904ri c2904ri) {
        return c2904ri.f8691ik - this.f8691ik;
    }

    /* JADX INFO: renamed from: ri */
    public JSONObject m11194ri(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            m11191ri(jSONObject2, jSONObject);
            m11189lr(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th) {
            C2707ac.m10197ik(th.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11195ri() {
        this.bgr = SystemClock.elapsedRealtime();
        this.f8697sf = 0;
        this.f8690fi = 0;
        this.f8691ik = 0;
        this.f8687aw = 0;
        this.f8695qt = 0;
        this.xha = 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ri */
    public void m11196ri(String str, String str2) {
        C2903lr c2903lr;
        C2903lr c2903lr2;
        C2903lr c2903lr3;
        C2903lr c2903lr4;
        C2903lr c2903lr5;
        C2903lr c2903lr6;
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -1908685858:
                if (str.equals("landingContinue")) {
                    b = 0;
                }
                break;
            case -1769688545:
                if (str.equals("landingPause")) {
                    b = 1;
                }
                break;
            case -1766371189:
                if (str.equals("landingStart")) {
                    b = 2;
                }
                break;
            case -1643912491:
                if (str.equals("feed_over")) {
                    b = 3;
                }
                break;
            case -1643892427:
                if (str.equals("feed_play")) {
                    b = 4;
                }
                break;
            case 3529469:
                if (str.equals("show")) {
                    b = 5;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    b = 6;
                }
                break;
            case 533457448:
                if (str.equals("feed_continue")) {
                    b = 7;
                }
                break;
            case 566194974:
                if (str.equals("feed_break")) {
                    b = 8;
                }
                break;
            case 578633749:
                if (str.equals("feed_pause")) {
                    b = 9;
                }
                break;
            case 695109002:
                if (str.equals("landingFinish")) {
                    b = 10;
                }
                break;
            case 702698279:
                if (str.equals("videoPercent30")) {
                    b = Ascii.f22503VT;
                }
                break;
            case 1338624943:
                if (str.equals("videoForceBreak")) {
                    b = Ascii.f22492FF;
                }
                break;
            case 1671642405:
                if (str.equals("dislike")) {
                    b = Ascii.f22490CR;
                }
                break;
            case 1912965437:
                if (str.equals("play_error")) {
                    b = Ascii.f22500SO;
                }
                break;
        }
        switch (b) {
            case 0:
                if (!TextUtils.isEmpty(str2) && (c2903lr = this.f8688co.get(str2)) != null) {
                    c2903lr.m11184ka(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 1:
                if (!TextUtils.isEmpty(str2) && (c2903lr2 = this.f8688co.get(str2)) != null) {
                    c2903lr2.m11183ik(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 2:
                if (!TextUtils.isEmpty(str2) && this.f8688co.get(str2) == null) {
                    C2903lr c2903lr7 = new C2903lr();
                    this.f8688co.put(str2, c2903lr7);
                    c2903lr7.m11188ri(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 3:
            case 8:
            case 12:
            case 14:
                if (!TextUtils.isEmpty(str2) && (c2903lr3 = this.jbs.get(str2)) != null && c2903lr3.m11186ri() != C2903lr.f8679fi) {
                    c2903lr3.m11185lr(SystemClock.elapsedRealtime());
                    if (C3367ri.m15193ri().m15211vr()) {
                        this.f8695qt = (int) (((long) this.f8695qt) + c2903lr3.m11187ri(this.bgr, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case 4:
                this.f8689di.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (C3367ri.m15193ri().m15207mj()) {
                    this.xha++;
                }
                if (!TextUtils.isEmpty(str2) && this.jbs.get(str2) == null) {
                    C2903lr c2903lr8 = new C2903lr();
                    this.jbs.put(str2, c2903lr8);
                    c2903lr8.m11188ri(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 5:
                this.f8696ri.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (C3367ri.m15193ri().m15202di()) {
                    this.f8691ik++;
                }
                break;
            case 6:
                if (!this.f8698vr.contains(str2)) {
                    if (this.f8698vr.size() > 50) {
                        this.f8698vr.subList(0, 25).clear();
                    }
                    this.f8698vr.add(str2);
                    this.f8692ka.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (C3367ri.m15193ri().xha()) {
                        this.f8690fi++;
                    }
                    break;
                }
                break;
            case 7:
                if (!TextUtils.isEmpty(str2) && (c2903lr4 = this.jbs.get(str2)) != null) {
                    c2903lr4.m11184ka(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 9:
                if (!TextUtils.isEmpty(str2) && (c2903lr5 = this.jbs.get(str2)) != null) {
                    c2903lr5.m11183ik(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case 10:
                if (!TextUtils.isEmpty(str2) && (c2903lr6 = this.f8688co.get(str2)) != null && c2903lr6.m11186ri() != C2903lr.f8679fi) {
                    c2903lr6.m11185lr(SystemClock.elapsedRealtime());
                    if (C3367ri.m15193ri().bgr()) {
                        this.f8687aw = (int) (((long) this.f8687aw) + c2903lr6.m11187ri(this.bgr, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case 11:
                if (C3367ri.m15193ri().m15200bu()) {
                    this.f8697sf++;
                }
                break;
            case 13:
                this.f8694mj.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }
}
