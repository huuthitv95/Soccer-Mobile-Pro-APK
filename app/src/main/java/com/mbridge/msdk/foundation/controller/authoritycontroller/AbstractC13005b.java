package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.SharedPreferencesOnSharedPreferenceChangeListenerC13010e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.b */
/* JADX INFO: compiled from: BaseSDKAuthorityController.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13005b {

    /* JADX INFO: renamed from: h */
    private static boolean f35502h = true;

    /* JADX INFO: renamed from: i */
    private static boolean f35503i = true;

    /* JADX INFO: renamed from: b */
    protected AuthorityInfoBean f35505b;

    /* JADX INFO: renamed from: g */
    private SharedPreferencesOnSharedPreferenceChangeListenerC13010e f35510g;

    /* JADX INFO: renamed from: a */
    public ArrayList<String> f35504a = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private int f35506c = 3;

    /* JADX INFO: renamed from: d */
    private int f35507d = 0;

    /* JADX INFO: renamed from: e */
    private int f35508e = 0;

    /* JADX INFO: renamed from: f */
    private String f35509f = "";

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.b$a */
    /* JADX INFO: compiled from: BaseSDKAuthorityController.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f35511a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ OnCompletionListener f35512b;

        a(Context context, OnCompletionListener onCompletionListener) {
            this.f35511a = context;
            this.f35512b = onCompletionListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC13005b.this.m36555a(this.f35511a);
            this.f35512b.onCompletion();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.b$b */
    /* JADX INFO: compiled from: BaseSDKAuthorityController.java */
    class b implements SharedPreferencesOnSharedPreferenceChangeListenerC13010e.a {
        b() {
        }

        @Override // com.mbridge.msdk.foundation.controller.SharedPreferencesOnSharedPreferenceChangeListenerC13010e.a
        /* JADX INFO: renamed from: a */
        public void mo36580a() {
            AbstractC13005b.this.m36564k();
        }
    }

    protected AbstractC13005b() {
        m36579h();
    }

    /* JADX INFO: renamed from: b */
    public static void m36560b(boolean z) {
        f35503i = z;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m36562i() {
        return f35502h;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m36563j() {
        return f35503i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k */
    public void m36564k() {
        boolean zM36617c = this.f35510g.m36617c();
        m36559b(this.f35510g.m36613b());
        m36561d(zM36617c ? 1 : 2);
        this.f35505b.authDeviceIdStatus(zM36617c ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    protected abstract int mo36565a(C13635g c13635g, String str);

    /* JADX INFO: renamed from: c */
    public int m36573c() {
        return this.f35507d;
    }

    /* JADX INFO: renamed from: d */
    public int m36575d() {
        return this.f35508e;
    }

    /* JADX INFO: renamed from: e */
    public int m36576e() {
        return this.f35506c;
    }

    /* JADX INFO: renamed from: f */
    public String m36577f() {
        return this.f35509f;
    }

    /* JADX INFO: renamed from: g */
    public String m36578g() {
        JSONArray jSONArray = new JSONArray();
        C13635g c13635gM39715c = C13636h.m39706b().m39715c();
        for (int i = 0; i < this.f35504a.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f35504a.get(i)));
                jSONObject.put("client_status", m36566a(this.f35504a.get(i)));
                jSONObject.put("server_status", mo36565a(c13635gM39715c, this.f35504a.get(i)));
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: h */
    protected void m36579h() {
        AuthorityInfoBean authorityInfoBean = new AuthorityInfoBean();
        this.f35505b = authorityInfoBean;
        try {
            authorityInfoBean.authGenDataStatus(1);
            this.f35505b.authDeviceIdStatus(1);
            this.f35505b.authSerialIdStatus(1);
            this.f35505b.authOtherDataStatus(1);
            this.f35504a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f35504a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f35504a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f35504a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e) {
            C13219q0.m37816b("SDKAuthorityController", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    private void m36561d(int i) {
        this.f35506c = i != 1 ? 2 : 1;
    }

    /* JADX INFO: renamed from: b */
    public boolean m36572b() {
        int i = this.f35506c;
        return i == 1 || i == 3;
    }

    /* JADX INFO: renamed from: c */
    public void m36574c(int i) {
        this.f35508e = i;
    }

    /* JADX INFO: renamed from: a */
    public static void m36558a(boolean z) {
        f35502h = z;
    }

    /* JADX INFO: renamed from: b */
    public void m36571b(int i) {
        this.f35507d = i;
    }

    /* JADX INFO: renamed from: b */
    private void m36559b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f35509f = str;
    }

    /* JADX INFO: renamed from: a */
    public AuthorityInfoBean m36567a() {
        AuthorityInfoBean authorityInfoBean = this.f35505b;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        AuthorityInfoBean authorityInfoBean2 = new AuthorityInfoBean();
        authorityInfoBean2.m36554a(1);
        return authorityInfoBean2;
    }

    /* JADX INFO: renamed from: a */
    public void m36568a(int i) {
        this.f35506c = i != 1 ? 2 : 1;
        if (this.f35505b != null) {
            m36561d(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36569a(Context context, OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            C13167a.m37543b().execute(new a(context, onCompletionListener));
        } else {
            m36555a(context);
        }
    }

    /* JADX INFO: renamed from: a */
    protected int m36566a(String str) {
        AuthorityInfoBean authorityInfoBean;
        try {
            if (TextUtils.isEmpty(str) || (authorityInfoBean = this.f35505b) == null) {
                return 0;
            }
            return authorityInfoBean.getStatusByKey(str);
        } catch (Exception e) {
            C13219q0.m37816b("SDKAuthorityController", e.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36570a(String str, int i) {
        if (TextUtils.isEmpty(str) || this.f35505b == null) {
            return;
        }
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "authority_serial_id":
                this.f35505b.authSerialIdStatus(i);
                break;
            case "authority_all_info":
                this.f35505b.m36554a(i);
                break;
            case "authority_device_id":
                this.f35505b.authDeviceIdStatus(i);
                break;
            case "authority_general_data":
                this.f35505b.authGenDataStatus(i);
                break;
            case "authority_other":
                this.f35505b.authOtherDataStatus(i);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m36555a(Context context) {
        try {
            if (this.f35510g == null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC13010e sharedPreferencesOnSharedPreferenceChangeListenerC13010e = new SharedPreferencesOnSharedPreferenceChangeListenerC13010e(context);
                this.f35510g = sharedPreferencesOnSharedPreferenceChangeListenerC13010e;
                sharedPreferencesOnSharedPreferenceChangeListenerC13010e.m36611a(new b());
            }
            m36564k();
        } catch (Throwable th) {
            C13219q0.m37816b("SDKAuthorityController", th.getMessage());
        }
    }
}
