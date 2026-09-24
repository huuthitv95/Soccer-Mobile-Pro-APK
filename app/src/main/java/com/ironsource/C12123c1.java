package com.ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c1 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C12123c1 implements Parcelable {
    public static final Parcelable.Creator<C12123c1> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    private String f30144a;

    /* JADX INFO: renamed from: b */
    private String f30145b;

    /* JADX INFO: renamed from: c */
    private String f30146c;

    /* JADX INFO: renamed from: d */
    private boolean f30147d;

    /* JADX INFO: renamed from: e */
    private int f30148e;

    /* JADX INFO: renamed from: f */
    private ArrayList<String> f30149f;

    /* JADX INFO: renamed from: g */
    private ArrayList<String> f30150g;

    /* JADX INFO: renamed from: h */
    private ArrayList<String> f30151h;

    /* JADX INFO: renamed from: i */
    private ArrayList<String> f30152i;

    /* JADX INFO: renamed from: j */
    private String f30153j;

    /* JADX INFO: renamed from: k */
    private String f30154k;

    /* JADX INFO: renamed from: l */
    private Map<String, String> f30155l;

    /* JADX INFO: renamed from: com.ironsource.c1$a */
    class a implements Parcelable.Creator<C12123c1> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C12123c1 createFromParcel(Parcel parcel) {
            return new C12123c1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C12123c1[] newArray(int i) {
            return new C12123c1[i];
        }
    }

    public C12123c1() {
        m31210i();
    }

    /* JADX INFO: renamed from: i */
    private void m31210i() {
        this.f30147d = false;
        this.f30148e = -1;
        this.f30149f = new ArrayList<>();
        this.f30150g = new ArrayList<>();
        this.f30151h = new ArrayList<>();
        this.f30152i = new ArrayList<>();
        this.f30154k = "";
        this.f30153j = "";
        this.f30155l = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public void m31213a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.f30150g.remove(str);
        } else if (this.f30150g.indexOf(str) == -1) {
            this.f30150g.add(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m31218b(String str) {
        return !TextUtils.isEmpty(str) && this.f30150g.indexOf(str) > -1;
    }

    /* JADX INFO: renamed from: c */
    public boolean m31221c(String str) {
        return !TextUtils.isEmpty(str) && this.f30152i.indexOf(str) > -1;
    }

    /* JADX INFO: renamed from: d */
    public String m31222d() {
        return this.f30153j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public Map<String, String> m31225e() {
        return this.f30155l;
    }

    /* JADX INFO: renamed from: f */
    public String m31227f() {
        return this.f30154k;
    }

    /* JADX INFO: renamed from: g */
    public void m31230g(String str) {
        this.f30153j = str;
    }

    /* JADX INFO: renamed from: h */
    public void m31232h(String str) {
        this.f30154k = str;
    }

    /* JADX INFO: renamed from: j */
    public boolean m31235j() {
        return this.f30147d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.f30147d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.f30148e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f30149f);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.f30150g);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.f30153j);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.f30154k);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.f30155l);
            sb.append(", ");
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeByte(this.f30147d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f30148e);
            parcel.writeString(this.f30144a);
            parcel.writeString(this.f30145b);
            parcel.writeString(this.f30146c);
            parcel.writeString(this.f30153j);
            parcel.writeString(this.f30154k);
            parcel.writeString(new JSONObject(this.f30155l).toString());
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m31224d(String str) {
        return !TextUtils.isEmpty(str) && this.f30149f.indexOf(str) > -1;
    }

    /* JADX INFO: renamed from: e */
    public boolean m31226e(String str) {
        return !TextUtils.isEmpty(str) && this.f30151h.indexOf(str) > -1;
    }

    /* JADX INFO: renamed from: f */
    public void m31228f(String str) {
        this.f30146c = str;
    }

    /* JADX INFO: renamed from: g */
    public String m31229g() {
        return this.f30144a;
    }

    /* JADX INFO: renamed from: h */
    public String m31231h() {
        return this.f30145b;
    }

    /* JADX INFO: renamed from: j */
    public void m31234j(String str) {
        this.f30145b = str;
    }

    private C12123c1(Parcel parcel) {
        m31210i();
        try {
            this.f30147d = parcel.readByte() != 0;
            this.f30148e = parcel.readInt();
            this.f30144a = parcel.readString();
            this.f30145b = parcel.readString();
            this.f30146c = parcel.readString();
            this.f30153j = parcel.readString();
            this.f30154k = parcel.readString();
            this.f30155l = m31209a(parcel.readString());
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            m31210i();
        }
    }

    /* JADX INFO: renamed from: b */
    public String m31216b() {
        return this.f30146c;
    }

    /* JADX INFO: renamed from: c */
    public int m31219c() {
        return this.f30148e;
    }

    /* JADX INFO: renamed from: b */
    public void m31217b(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            if (this.f30152i.indexOf(str) == -1) {
                this.f30152i.add(str);
                return;
            }
            return;
        }
        this.f30152i.remove(str);
    }

    /* JADX INFO: renamed from: c */
    public void m31220c(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            if (this.f30149f.indexOf(str) == -1) {
                this.f30149f.add(str);
                return;
            }
            return;
        }
        this.f30149f.remove(str);
    }

    /* JADX INFO: renamed from: d */
    public void m31223d(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            if (this.f30151h.indexOf(str) == -1) {
                this.f30151h.add(str);
                return;
            }
            return;
        }
        this.f30151h.remove(str);
    }

    /* JADX INFO: renamed from: a */
    public void m31214a(Map<String, String> map) {
        this.f30155l = map;
    }

    /* JADX INFO: renamed from: a */
    public void m31215a(boolean z) {
        this.f30147d = z;
    }

    /* JADX INFO: renamed from: a */
    public void m31212a(int i) {
        this.f30148e = i;
    }

    /* JADX INFO: renamed from: a */
    public void m31211a() {
        this.f30148e = -1;
    }

    /* JADX INFO: renamed from: a */
    private Map<String, String> m31209a(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            IronLog.INTERNAL.error(th.toString());
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    public void m31233i(String str) {
        this.f30144a = str;
    }
}
