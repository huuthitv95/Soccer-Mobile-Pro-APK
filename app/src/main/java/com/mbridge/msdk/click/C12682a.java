package com.mbridge.msdk.click;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.C11341A5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13071e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13014d;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.util.C13884b;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.click.a */
/* JADX INFO: compiled from: CommonClickControl.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12682a {

    /* JADX INFO: renamed from: n */
    public static boolean f33614n;

    /* JADX INFO: renamed from: o */
    public static Map<String, Long> f33615o = new HashMap();

    /* JADX INFO: renamed from: p */
    public static Set<String> f33616p = new HashSet();

    /* JADX INFO: renamed from: a */
    private String f33617a;

    /* JADX INFO: renamed from: b */
    private long f33618b;

    /* JADX INFO: renamed from: c */
    private C13017g f33619c;

    /* JADX INFO: renamed from: d */
    private Context f33620d;

    /* JADX INFO: renamed from: e */
    private C12686e f33621e;

    /* JADX INFO: renamed from: g */
    private final C13146h f33623g;

    /* JADX INFO: renamed from: h */
    private C13635g f33624h;

    /* JADX INFO: renamed from: i */
    private final boolean f33625i;

    /* JADX INFO: renamed from: l */
    private boolean f33628l;

    /* JADX INFO: renamed from: m */
    private InterfaceC12693j f33629m;

    /* JADX INFO: renamed from: f */
    private NativeListener.NativeTrackingListener f33622f = null;

    /* JADX INFO: renamed from: j */
    private boolean f33626j = false;

    /* JADX INFO: renamed from: k */
    private boolean f33627k = true;

    /* JADX INFO: renamed from: com.mbridge.msdk.click.a$a */
    /* JADX INFO: compiled from: CommonClickControl.java */
    class a implements InterfaceC12690g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f33630a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f33631b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f33632c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CampaignEx f33633d;

        a(int i, String str, int i2, CampaignEx campaignEx) {
            this.f33630a = i;
            this.f33631b = str;
            this.f33632c = i2;
            this.f33633d = campaignEx;
        }

        @Override // com.mbridge.msdk.click.InterfaceC12690g
        /* JADX INFO: renamed from: a */
        public void mo34642a(Object obj) {
            try {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("result", 2);
                c13157e.m37501a("net_ty", String.valueOf(this.f33630a));
                if (obj != null && (obj instanceof JumpLoaderResult)) {
                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                    String str = jumpLoaderResult.getStatusCode() + "";
                    c13157e.m37501a("status_code", str);
                    if (str.startsWith("2")) {
                        c13157e.m37501a("result", 1);
                    } else {
                        String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                        if (TextUtils.isEmpty(exceptionMsg)) {
                            exceptionMsg = "UNKNOWN EXCEPTION and Status Code is : " + str;
                        }
                        c13157e.m37501a("failingURL", C13188c1.m37648d(this.f33631b));
                        c13157e.m37501a("reason", exceptionMsg);
                    }
                }
                String strM34624b = C12682a.m34624b(this.f33632c);
                if (this.f33633d != null) {
                    C13156d.m37475b().m37483a(strM34624b, this.f33633d, c13157e);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("CommonClickControl", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.InterfaceC12690g
        /* JADX INFO: renamed from: a */
        public void mo34643a(Object obj, String str) {
            try {
                String strM34624b = C12682a.m34624b(this.f33632c);
                C13157e c13157e = new C13157e();
                c13157e.m37501a("result", 2);
                if (obj instanceof JumpLoaderResult) {
                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                    String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                    if (!TextUtils.isEmpty(exceptionMsg)) {
                        str = exceptionMsg;
                    }
                    c13157e.m37501a("reason", str);
                    c13157e.m37501a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                }
                c13157e.m37501a(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "");
                c13157e.m37501a("failingURL", C13188c1.m37648d(this.f33631b));
                c13157e.m37501a("net_ty", String.valueOf(this.f33630a));
                if (this.f33633d != null) {
                    C13156d.m37475b().m37483a(strM34624b, this.f33633d, c13157e);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("CommonClickControl", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.InterfaceC12690g
        /* JADX INFO: renamed from: b */
        public void mo34644b(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.a$b */
    /* JADX INFO: compiled from: CommonClickControl.java */
    class b implements InterfaceC12690g {
        b() {
        }

        @Override // com.mbridge.msdk.click.InterfaceC12690g
        /* JADX INFO: renamed from: a */
        public void mo34642a(Object obj) {
        }

        @Override // com.mbridge.msdk.click.InterfaceC12690g
        /* JADX INFO: renamed from: a */
        public void mo34643a(Object obj, String str) {
        }

        @Override // com.mbridge.msdk.click.InterfaceC12690g
        /* JADX INFO: renamed from: b */
        public void mo34644b(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.a$c */
    /* JADX INFO: compiled from: CommonClickControl.java */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f33634a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f33635b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CampaignEx f33636c;

        c(boolean z, boolean z2, CampaignEx campaignEx) {
            this.f33634a = z;
            this.f33635b = z2;
            this.f33636c = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f33634a && !C12682a.f33614n && !C12682a.this.f33628l && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER && !this.f33635b) {
                C12682a.this.m34627d(this.f33636c);
            }
            if (this.f33634a || C12682a.this.f33622f == null || C12682a.f33614n || C12682a.this.f33628l || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                return;
            }
            C12682a.this.f33622f.onShowLoading(this.f33636c);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.a$d */
    /* JADX INFO: compiled from: CommonClickControl.java */
    class d implements InterfaceC12690g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f33638a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f33639b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Boolean f33640c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ List f33641d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ boolean f33642e;

        d(CampaignEx campaignEx, boolean z, Boolean bool, List list, boolean z2) {
            this.f33638a = campaignEx;
            this.f33639b = z;
            this.f33640c = bool;
            this.f33641d = list;
            this.f33642e = z2;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0092  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11, types: [int] */
        /* JADX WARN: Type inference failed for: r0v16 */
        @Override // com.mbridge.msdk.click.InterfaceC12690g
        /* JADX INFO: renamed from: a */
        public void mo34642a(Object obj) {
            Throwable th;
            ?? StartsWith;
            Set<String> set = C12682a.f33616p;
            if (set != null) {
                set.remove(this.f33638a.getId());
            }
            JumpLoaderResult jumpLoaderResult = null;
            if (obj != null) {
                try {
                    if (obj instanceof JumpLoaderResult) {
                        JumpLoaderResult jumpLoaderResult2 = (JumpLoaderResult) obj;
                        try {
                            this.f33638a.setJumpResult(jumpLoaderResult2);
                            C12682a c12682a = C12682a.this;
                            c12682a.m34615a(this.f33638a, jumpLoaderResult2, this.f33639b, c12682a.f33626j, this.f33640c, (List<String>) this.f33641d);
                            if (jumpLoaderResult2.isjumpDone()) {
                                C12683b.m34649a(C13014d.m36637a(C12682a.this.f33619c), this.f33638a, C12682a.this.f33617a);
                            }
                            C12682a.this.m34618a(this.f33642e, this.f33638a);
                            jumpLoaderResult = jumpLoaderResult2;
                        } catch (Throwable th2) {
                            th = th2;
                            jumpLoaderResult = jumpLoaderResult2;
                            C13219q0.m37816b("CommonClickControl", th.getMessage());
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            try {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("result", "1");
                if (jumpLoaderResult != null) {
                    c13157e.m37501a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                }
                CampaignEx campaignEx = this.f33638a;
                if (campaignEx != null) {
                    String clickURL = campaignEx.getClickURL();
                    if (TextUtils.isEmpty(clickURL)) {
                        StartsWith = -1;
                    } else {
                        StartsWith = clickURL.startsWith("tcp");
                    }
                } else {
                    StartsWith = -1;
                }
                c13157e.m37501a("net_ty", Integer.valueOf((int) StartsWith));
                C13156d.m37475b().m37483a("2000138", this.f33638a, c13157e);
            } catch (Throwable th4) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("CommonClickControl", th4.getMessage());
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0062  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v10, types: [int] */
        /* JADX WARN: Type inference failed for: r6v21 */
        /* JADX WARN: Type inference failed for: r6v9 */
        @Override // com.mbridge.msdk.click.InterfaceC12690g
        /* JADX INFO: renamed from: a */
        public void mo34643a(Object obj, String str) {
            ?? StartsWith;
            Set<String> set = C12682a.f33616p;
            if (set != null) {
                set.remove(this.f33638a.getId());
            }
            JumpLoaderResult jumpLoaderResult = null;
            if (obj != null) {
                try {
                    if (obj instanceof JumpLoaderResult) {
                        JumpLoaderResult jumpLoaderResult2 = (JumpLoaderResult) obj;
                        try {
                            C12682a.this.m34613a((JumpLoaderResult) obj, this.f33638a, true);
                            jumpLoaderResult = jumpLoaderResult2;
                        } catch (Throwable th) {
                            th = th;
                            jumpLoaderResult = jumpLoaderResult2;
                            C13219q0.m37816b("CommonClickControl", th.getMessage());
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (C12682a.this.f33622f != null) {
                C12682a.this.f33622f.onRedirectionFailed(this.f33638a, str);
            }
            C12682a.this.m34618a(this.f33642e, this.f33638a);
            try {
                CampaignEx campaignEx = this.f33638a;
                if (campaignEx != null) {
                    String clickURL = campaignEx.getClickURL();
                    if (TextUtils.isEmpty(clickURL)) {
                        StartsWith = -1;
                    } else {
                        StartsWith = clickURL.startsWith("tcp");
                    }
                } else {
                    StartsWith = -1;
                }
                C13157e c13157e = new C13157e();
                c13157e.m37501a("result", "2");
                c13157e.m37501a("net_ty", Integer.valueOf((int) StartsWith));
                if (jumpLoaderResult != null) {
                    c13157e.m37501a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                }
                C13156d.m37475b().m37483a("2000138", this.f33638a, c13157e);
            } catch (Throwable th3) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("CommonClickControl", th3.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.InterfaceC12690g
        /* JADX INFO: renamed from: b */
        public void mo34644b(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.a$e */
    /* JADX INFO: compiled from: CommonClickControl.java */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f33644a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Campaign f33645b;

        e(boolean z, Campaign campaign) {
            this.f33644a = z;
            this.f33645b = campaign;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f33644a && !C12682a.f33614n && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                C12682a.this.m34602a();
            }
            if (C12682a.this.f33622f == null || C12682a.f33614n || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                return;
            }
            C12682a.this.f33622f.onDismissLoading(this.f33645b);
        }
    }

    public C12682a(Context context, String str) {
        this.f33619c = null;
        this.f33620d = null;
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(str);
        this.f33624h = c13635gM39718d;
        if (c13635gM39718d == null) {
            this.f33624h = C13636h.m39706b().m39708a();
        }
        this.f33625i = this.f33624h.m39430N0();
        Context applicationContext = context.getApplicationContext();
        this.f33620d = applicationContext;
        this.f33617a = str;
        if (this.f33619c == null) {
            this.f33619c = C13017g.m36693a(applicationContext);
        }
        this.f33623g = new C13146h(this.f33620d);
    }

    /* JADX INFO: renamed from: a */
    private AppletSchemeCallBack m34600a(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, C12682a c12682a) {
        return new C12691h(nativeTrackingListener, campaignEx, appletsModel, c12682a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m34602a() {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            this.f33620d.sendBroadcast(intent);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("CommonClickControl", "Exception", e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m34603a(int i, CampaignEx campaignEx, int i2) {
        if (campaignEx != null) {
            try {
                String strM34624b = m34624b(i);
                C13157e c13157e = new C13157e();
                c13157e.m37501a("net_ty", Integer.valueOf(i2));
                c13157e.m37501a("result", 3);
                C13156d.m37475b().m37483a(strM34624b, campaignEx, c13157e);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34604a(int i, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (i == 2) {
                C13227u0.m37855a(this.f33620d, str, campaignEx, nativeTrackingListener, list);
            } else {
                C13227u0.m37857a(this.f33620d, str, nativeTrackingListener, campaignEx, list);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("CommonClickControl", th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m34605a(Context context, CampaignEx campaignEx, String str, String str2, boolean z, boolean z2) {
        if (context == null) {
            return;
        }
        new C12686e(context.getApplicationContext()).m34665a(str, campaignEx, null, str2, z, z2, C12701a.f33765l);
    }

    /* JADX INFO: renamed from: a */
    public static void m34606a(Context context, CampaignEx campaignEx, String str, String str2, boolean z, boolean z2, int i) {
        int i2;
        if (context == null) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            i2 = -1;
        } else {
            i2 = str2.startsWith("tcp") ? 1 : 0;
        }
        m34603a(i, campaignEx, i2);
        new C12686e(context.getApplicationContext()).m34665a(str, campaignEx, new a(i2, str2, i, campaignEx), str2, z, z2, i);
    }

    /* JADX INFO: renamed from: a */
    public static void m34607a(Context context, CampaignEx campaignEx, String str, String[] strArr, boolean z, boolean z2) {
        if (context == null || campaignEx == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        C12686e c12686e = new C12686e(context.getApplicationContext());
        for (String str2 : strArr) {
            c12686e.m34665a(str, campaignEx, new b(), str2, z, z2, C12701a.f33765l);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34608a(Context context, CampaignEx campaignEx, List<String> list) {
        if (context == null) {
            C13148j.m37379a(C13008c.m36588n().m36542d(), campaignEx, 2, "context is null", this.f33617a);
            return;
        }
        boolean z = C13211m0.m37727G() == 1;
        boolean z2 = C13211m0.m37724E(context) == 1;
        if (!z || !z2) {
            C13148j.m37379a(context, campaignEx, 2, "integrated:" + z + "-hasWx:" + z2, this.f33617a);
            m34616a(campaignEx, list);
            return;
        }
        String ghId = campaignEx.getGhId();
        String ghPath = campaignEx.getGhPath();
        String bindId = campaignEx.getBindId();
        String strM36551j = C13008c.m36588n().m36551j();
        if (TextUtils.isEmpty(ghId)) {
            m34616a(campaignEx, list);
            C13148j.m37379a(context, campaignEx, 2, "ghid is empty", this.f33617a);
            return;
        }
        try {
            if (!TextUtils.isEmpty(strM36551j)) {
                bindId = strM36551j;
            }
            Object objM37739d = C13211m0.m37739d(bindId);
            Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
            Object objNewInstance = cls.newInstance();
            cls.getField("userName").set(objNewInstance, ghId);
            cls.getField("path").set(objNewInstance, ghPath);
            cls.getField("miniprogramType").set(objNewInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
            Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(objM37739d, objNewInstance);
            C13148j.m37379a(context, campaignEx, 1, "", this.f33617a);
        } catch (Throwable th) {
            C13148j.m37379a(context, campaignEx, 2, th.getMessage(), this.f33617a);
            m34616a(campaignEx, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m34613a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, boolean z) {
        m34631a(jumpLoaderResult, campaignEx, 1, z);
    }

    /* JADX INFO: renamed from: a */
    private void m34614a(CampaignEx campaignEx, int i, int i2, List<String> list) {
        try {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("type", Integer.valueOf(i));
            c13157e.m37501a("result", Integer.valueOf(i2));
            if (list != null) {
                c13157e.m37501a("click_path", list.toString());
            }
            C13156d.m37475b().m37483a("2000150", campaignEx, c13157e);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("CommonClickControl", e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:3:0x0002, B:6:0x0008, B:10:0x0012, B:12:0x001c, B:14:0x0022, B:16:0x0031, B:19:0x003f, B:21:0x0045, B:25:0x0055, B:27:0x0059, B:29:0x006b, B:33:0x0076, B:35:0x0080, B:37:0x008a, B:40:0x009a, B:42:0x00a8, B:49:0x00e8, B:52:0x00ee, B:73:0x014a, B:75:0x0158, B:77:0x0160, B:81:0x0168, B:76:0x015d, B:44:0x00b8, B:46:0x00c2, B:48:0x00dc, B:55:0x00fa, B:56:0x0107, B:59:0x010d, B:62:0x0118, B:64:0x011e, B:66:0x0122, B:68:0x0128, B:70:0x0134, B:72:0x0143, B:84:0x0172, B:86:0x0179), top: B:91:0x0002 }] */
    /* JADX INFO: renamed from: a */
    public void m34615a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z, boolean z2, Boolean bool, List<String> list) {
        try {
            if (this.f33627k) {
                C12683b.m34645a();
                if (campaignEx != null && jumpLoaderResult != null) {
                    int iM34623b = m34623b();
                    int code = jumpLoaderResult.getCode();
                    if (bool != null && !bool.booleanValue()) {
                        C12683b.m34648a(jumpLoaderResult, this.f33620d, this.f33617a, campaignEx, Boolean.FALSE, this.f33622f, list);
                        return;
                    }
                    if (TextUtils.isEmpty(jumpLoaderResult.getUrl()) && z) {
                        int linkType = campaignEx.getLinkType();
                        if (linkType == 2) {
                            m34621a(campaignEx, jumpLoaderResult, z, m34623b(), list);
                            return;
                        }
                        if (linkType == 3) {
                            m34622a(campaignEx, jumpLoaderResult, z, list);
                            return;
                        }
                        C13227u0.m37857a(this.f33620d, campaignEx.getClickURL(), this.f33622f, campaignEx, list);
                        m34613a(jumpLoaderResult, campaignEx, true);
                        NativeListener.NativeTrackingListener nativeTrackingListener = this.f33622f;
                        if (nativeTrackingListener != null) {
                            nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                            return;
                        }
                        return;
                    }
                    if (code == 1) {
                        if (TextUtils.isEmpty(campaignEx.getPackageName()) || TextUtils.isEmpty(jumpLoaderResult.getUrl()) || !jumpLoaderResult.getUrl().contains(campaignEx.getPackageName()) || !z) {
                            if (z) {
                                if (TextUtils.isEmpty(campaignEx.getPackageName())) {
                                    m34604a(iM34623b, jumpLoaderResult.getUrl(), campaignEx, this.f33622f, list);
                                } else {
                                    if (!C13227u0.a.m37866a(this.f33620d, "market://details?id=" + campaignEx.getPackageName(), this.f33622f)) {
                                        m34604a(iM34623b, jumpLoaderResult.getUrl(), campaignEx, this.f33622f, list);
                                    }
                                }
                            }
                        } else if (!C13227u0.a.m37866a(this.f33620d, jumpLoaderResult.getUrl(), this.f33622f)) {
                            m34604a(iM34623b, jumpLoaderResult.getUrl(), campaignEx, this.f33622f, list);
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f33622f;
                        if (nativeTrackingListener2 != null && z) {
                            nativeTrackingListener2.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                        }
                    } else if (code == 3) {
                        if (z) {
                            C12683b.m34646a(this.f33620d, campaignEx, this.f33617a, jumpLoaderResult, bool, this.f33622f, list);
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener3 = this.f33622f;
                        if (nativeTrackingListener3 != null && z) {
                            nativeTrackingListener3.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                        }
                    } else if (z) {
                        if (3 == campaignEx.getLinkType()) {
                            m34622a(campaignEx, jumpLoaderResult, z, list);
                            return;
                        } else {
                            if (2 == campaignEx.getLinkType()) {
                                m34621a(campaignEx, jumpLoaderResult, z, m34623b(), list);
                                return;
                            }
                            C13227u0.m37857a(this.f33620d, jumpLoaderResult.getUrl(), this.f33622f, campaignEx, list);
                            NativeListener.NativeTrackingListener nativeTrackingListener4 = this.f33622f;
                            if (nativeTrackingListener4 != null) {
                                nativeTrackingListener4.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                            }
                        }
                    }
                    if (m34619a(campaignEx.getLinkType(), jumpLoaderResult.getUrl())) {
                        m34613a(jumpLoaderResult, campaignEx, false);
                    } else {
                        m34613a(jumpLoaderResult, campaignEx, true);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener5 = this.f33622f;
                    if (nativeTrackingListener5 == null || z || !z2) {
                        return;
                    }
                    nativeTrackingListener5.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                    return;
                }
                if (z) {
                    m34613a(jumpLoaderResult, campaignEx, true);
                    NativeListener.NativeTrackingListener nativeTrackingListener6 = this.f33622f;
                    if (nativeTrackingListener6 != null) {
                        nativeTrackingListener6.onRedirectionFailed(null, null);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34616a(CampaignEx campaignEx, List<String> list) {
        if (m34623b() == 2) {
            C13227u0.m37855a(this.f33620d, campaignEx.getClickURL(), campaignEx, this.f33622f, list);
        } else {
            C13227u0.m37857a(this.f33620d, campaignEx.getClickURL(), this.f33622f, campaignEx, list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080 A[PHI: r4
  0x0080: PHI (r4v4 boolean) = (r4v2 boolean), (r4v1 boolean) binds: [B:41:0x00d7, B:21:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    private void m34617a(CampaignEx campaignEx, boolean z, Boolean bool, List<String> list) {
        boolean z2;
        boolean z3;
        try {
            this.f33618b = System.currentTimeMillis();
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f33622f;
            if (nativeTrackingListener == null || z) {
                z2 = true;
            } else {
                nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                z2 = !this.f33622f.onInterceptDefaultLoadingDialog();
            }
            this.f33628l = false;
            boolean z4 = true;
            if (campaignEx.getJumpResult() != null) {
                if (!z) {
                    m34615a(campaignEx, campaignEx.getJumpResult(), true, this.f33626j, bool, list);
                }
                this.f33628l = true;
                this.f33626j = false;
                z4 = false;
            }
            if (!C13014d.m36637a(this.f33619c).m36641c(campaignEx.getId(), this.f33617a) || campaignEx.getJumpResult() == null) {
                C13014d c13014dM36637a = C13014d.m36637a(this.f33619c);
                c13014dM36637a.m36642d();
                JumpLoaderResult jumpLoaderResultM36640b = c13014dM36637a.m36640b(campaignEx.getId(), this.f33617a);
                if (jumpLoaderResultM36640b == null || z) {
                    if (campaignEx.getClick_mode().equals("6") && !campaignEx.getPackageName().isEmpty() && campaignEx.getLinkType() == 2 && !z) {
                        boolean zM37866a = C13227u0.a.m37866a(this.f33620d, "market://details?id=" + campaignEx.getPackageName(), this.f33622f);
                        if (list != null) {
                            list.add("google_play");
                        }
                        if (zM37866a) {
                            m34614a(campaignEx, 1, 1, list);
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f33622f;
                        if (nativeTrackingListener2 != null && z4) {
                            nativeTrackingListener2.onDismissLoading(campaignEx);
                            this.f33622f.onFinishRedirection(campaignEx, null);
                        }
                        this.f33628l = true;
                        z4 = false;
                    }
                    if (z) {
                        this.f33628l = true;
                        this.f33626j = false;
                        z3 = false;
                    } else {
                        z3 = z4;
                    }
                } else {
                    campaignEx.setJumpResult(jumpLoaderResultM36640b);
                    if (z4) {
                        m34615a(campaignEx, jumpLoaderResultM36640b, z4, this.f33626j, bool, list);
                        this.f33628l = true;
                        this.f33626j = false;
                        z3 = false;
                    } else {
                        z3 = z4;
                    }
                }
                new Handler(Looper.getMainLooper()).post(new c(z2, z, campaignEx));
                C12686e c12686e = this.f33621e;
                if (c12686e != null) {
                    c12686e.m34663a();
                }
                Set<String> set = f33616p;
                if (set != null && set.contains(campaignEx.getId())) {
                    NativeListener.NativeTrackingListener nativeTrackingListener3 = this.f33622f;
                    if (nativeTrackingListener3 != null) {
                        nativeTrackingListener3.onDismissLoading(campaignEx);
                        this.f33622f.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                Set<String> set2 = f33616p;
                if (set2 != null) {
                    set2.add(campaignEx.getId());
                }
                C12686e c12686e2 = new C12686e(this.f33620d);
                this.f33621e = c12686e2;
                c12686e2.m34664a(this.f33617a, campaignEx, new d(campaignEx, z3, bool, list, z2));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m34618a(boolean z, Campaign campaign) {
        new Handler(Looper.getMainLooper()).post(new e(z, campaign));
    }

    /* JADX INFO: renamed from: a */
    private boolean m34619a(int i, String str) {
        try {
            if (i == 2) {
                return C13227u0.a.m37868b(str);
            }
            return !TextUtils.isEmpty(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m34621a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z, int i, List<String> list) {
        boolean z2 = true;
        boolean z3 = false;
        if (z) {
            try {
                int i2 = Integer.parseInt(campaignEx.getLandingType());
                if (i2 == 1) {
                    C13227u0.m37857a(this.f33620d, jumpLoaderResult.getUrl(), this.f33622f, campaignEx, list);
                } else if (i2 == 2) {
                    C13227u0.m37855a(this.f33620d, jumpLoaderResult.getUrl(), campaignEx, this.f33622f, list);
                } else if (campaignEx.getPackageName() != null) {
                    if (C13227u0.a.m37866a(this.f33620d, "market://details?id=" + campaignEx.getPackageName(), this.f33622f)) {
                        if (list != null) {
                            try {
                                list.add("google_play");
                            } catch (Throwable th) {
                                th = th;
                                if (MBridgeConstans.DEBUG) {
                                    C13219q0.m37817b("CommonClickControl", th.getMessage(), th);
                                }
                                return z2;
                            }
                        }
                        m34614a(campaignEx, 1, 1, list);
                    } else {
                        m34604a(i, jumpLoaderResult.getUrl(), campaignEx, this.f33622f, list);
                    }
                } else {
                    m34604a(i, jumpLoaderResult.getUrl(), campaignEx, this.f33622f, list);
                }
                z3 = true;
            } catch (Throwable th2) {
                th = th2;
                z2 = false;
            }
        }
        if (z3) {
            m34613a(jumpLoaderResult, campaignEx, true);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f33622f;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                return z3;
            }
        } else {
            m34613a(jumpLoaderResult, campaignEx, true);
            NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f33622f;
            if (nativeTrackingListener2 != null && z) {
                nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z3;
    }

    /* JADX INFO: renamed from: a */
    private boolean m34622a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z, List<String> list) {
        boolean z2 = false;
        if (z) {
            try {
                if (C13884b.m41421a()) {
                    C12683b.m34647a(this.f33620d, this.f33617a, campaignEx, campaignEx.getNoticeUrl(), C13088a.f35847M);
                }
                C13227u0.m37857a(this.f33620d, campaignEx.getClickURL(), this.f33622f, campaignEx, list);
                z2 = true;
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("CommonClickControl", th.getMessage(), th);
                }
                return false;
            }
        }
        m34613a(jumpLoaderResult, campaignEx, true);
        if (z2) {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f33622f;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                return z2;
            }
        } else {
            if (C13884b.m41421a()) {
                m34613a(jumpLoaderResult, campaignEx, true);
            }
            NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f33622f;
            if (nativeTrackingListener2 != null) {
                nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: b */
    private int m34623b() {
        try {
            C13635g c13635g = this.f33624h;
            if (c13635g != null) {
                return c13635g.m39448W();
            }
            return 1;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m34624b(int i) {
        if (i == 1) {
            return "2000136";
        }
        if (i == 2) {
            return "2000137";
        }
        if (i != 3) {
            return i != 4 ? "" : "2000138";
        }
        return "2000139";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m34627d(CampaignEx campaignEx) {
        try {
            Intent intent = new Intent(this.f33620d, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            this.f33620d.startActivity(intent);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("CommonClickControl", "Exception", e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m34631a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, int i, boolean z) {
        if (campaignEx == null || jumpLoaderResult == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f33618b;
            C13071e c13071e = new C13071e();
            int iM37770s = C13211m0.m37770s(this.f33620d);
            c13071e.m36827e(iM37770s);
            c13071e.m36835h(C13211m0.m37732a(this.f33620d, iM37770s));
            c13071e.m36837i(campaignEx.getRequestId());
            c13071e.m36839j(campaignEx.getRequestIdNotice());
            c13071e.m36815a(i);
            c13071e.m36822c(jCurrentTimeMillis + "");
            c13071e.m36816a(campaignEx.getId());
            c13071e.m36830f(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                c13071e.m36833g(URLEncoder.encode(jumpLoaderResult.getUrl(), C11341A5.f23802O));
            }
            c13071e.m36819b((this.f33618b / 1000) + "");
            c13071e.m36821c(Integer.parseInt(campaignEx.getLandingType()));
            c13071e.m36824d(campaignEx.getLinkType());
            c13071e.m36841k(this.f33617a);
            c13071e.m36830f(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                c13071e.m36833g(URLEncoder.encode(jumpLoaderResult.getUrl(), C11341A5.f23802O));
            }
            if (this.f33625i) {
                c13071e.m36818b(jumpLoaderResult.getStatusCode());
                if (!TextUtils.isEmpty(jumpLoaderResult.getHeader())) {
                    c13071e.m36831f(URLEncoder.encode(jumpLoaderResult.getHeader(), C11341A5.f23802O));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    c13071e.m36825d(URLEncoder.encode(jumpLoaderResult.getContent(), "UTF-8"));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getExceptionMsg())) {
                    c13071e.m36828e(URLEncoder.encode(jumpLoaderResult.getExceptionMsg(), C11341A5.f23802O));
                }
            }
            if (z) {
                this.f33623g.m37368a("click_jump_error", c13071e, this.f33617a);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(c13071e);
            ArrayList<JSONObject> arrayListM36812a = C13071e.m36812a(arrayList);
            if (arrayListM36812a == null || arrayListM36812a.isEmpty()) {
                return;
            }
            Iterator<JSONObject> it = arrayListM36812a.iterator();
            while (it.hasNext()) {
                C13156d.m37475b().m37488a(it.next());
            }
        } catch (Throwable th) {
            C13219q0.m37816b("CommonClickControl", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m34632a(InterfaceC12693j interfaceC12693j) {
        this.f33629m = interfaceC12693j;
    }

    /* JADX INFO: renamed from: a */
    public void m34633a(CampaignEx campaignEx) {
        C12682a c12682a = this;
        if (campaignEx == null) {
            return;
        }
        try {
            if (m34639b(campaignEx)) {
                m34641c(campaignEx);
                C13156d.m37475b().m37482a("2000149", campaignEx);
                String noticeUrl = campaignEx.getNoticeUrl();
                C13014d c13014dM36637a = C13014d.m36637a(c12682a.f33619c);
                c13014dM36637a.m36642d();
                JumpLoaderResult jumpLoaderResultM36640b = c13014dM36637a.m36640b(campaignEx.getId(), c12682a.f33617a);
                if (jumpLoaderResultM36640b != null) {
                    if (jumpLoaderResultM36640b.getNoticeurl() != null) {
                        jumpLoaderResultM36640b.setNoticeurl(null);
                    }
                    campaignEx.setJumpResult(jumpLoaderResultM36640b);
                    C12683b.m34649a(c13014dM36637a, campaignEx, c12682a.f33617a);
                }
                ArrayList arrayList = new ArrayList();
                AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
                if (C13229v0.m37909b(campaignEx)) {
                    MIMManager.m37565b().m37580a(campaignEx);
                    arrayList.add(CampaignEx.JSON_KEY_DEEP_LINK_URL);
                    if (C12684c.m34660d(c12682a.f33620d, campaignEx.getDeepLinkURL())) {
                        NativeListener.NativeTrackingListener nativeTrackingListener = c12682a.f33622f;
                        if (nativeTrackingListener != null) {
                            nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        C12683b.m34647a(c12682a.f33620d, c12682a.f33617a, campaignEx, noticeUrl + "&opdptype=1", -1);
                        C12683b.m34650a(campaignEx);
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = c12682a.f33622f;
                        if (nativeTrackingListener2 != null) {
                            nativeTrackingListener2.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        c12682a.m34614a(campaignEx, 3, 1, arrayList);
                        return;
                    }
                    noticeUrl = noticeUrl + "&opdptype=0";
                    MIMManager.m37565b().m37582b(campaignEx);
                }
                String str = noticeUrl;
                if (campaignEx.getLinkType() == 12) {
                    NativeListener.NativeTrackingListener nativeTrackingListener3 = c12682a.f33622f;
                    if (nativeTrackingListener3 != null) {
                        nativeTrackingListener3.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    C12683b.m34647a(c12682a.f33620d, c12682a.f33617a, campaignEx, str, -1);
                    c12682a.m34608a(c12682a.f33620d, campaignEx, arrayList);
                    NativeListener.NativeTrackingListener nativeTrackingListener4 = c12682a.f33622f;
                    if (nativeTrackingListener4 != null) {
                        nativeTrackingListener4.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                if (appletsModel != null && appletsModel.isSupportWxScheme()) {
                    if (appletsModel.isRequestSuccess()) {
                        if (C12684c.m34660d(c12682a.f33620d, appletsModel.getDeepLink())) {
                            NativeListener.NativeTrackingListener nativeTrackingListener5 = c12682a.f33622f;
                            if (nativeTrackingListener5 != null) {
                                nativeTrackingListener5.onStartRedirection(campaignEx, campaignEx.getClickURL());
                            }
                            if (c12682a.f33620d != null) {
                                Intent intent = new Intent();
                                intent.setAction("mb_dp_close_broadcast_receiver");
                                try {
                                    c12682a.f33620d.sendBroadcast(intent);
                                } catch (Exception e2) {
                                    if (MBridgeConstans.DEBUG) {
                                        C13219q0.m37816b("CommonClickControl", e2.getMessage());
                                    }
                                }
                            }
                            C12683b.m34647a(c12682a.f33620d, c12682a.f33617a, campaignEx, str + "&opdptype=1", -1);
                            C12683b.m34650a(campaignEx);
                            NativeListener.NativeTrackingListener nativeTrackingListener6 = c12682a.f33622f;
                            if (nativeTrackingListener6 != null) {
                                nativeTrackingListener6.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                                return;
                            }
                            return;
                        }
                        str = str + "&opdptype=0";
                    } else {
                        if (appletsModel.isRequesting()) {
                            NativeListener.NativeTrackingListener nativeTrackingListener7 = c12682a.f33622f;
                            if (nativeTrackingListener7 != null) {
                                nativeTrackingListener7.onStartRedirection(campaignEx, campaignEx.getClickURL());
                            }
                            appletsModel.setAppletSchemeCallBack(c12682a.m34600a(c12682a.f33622f, campaignEx, appletsModel, c12682a));
                            return;
                        }
                        if (appletsModel.can(1)) {
                            if (!appletsModel.isRequestTimesMaxPerDay()) {
                                NativeListener.NativeTrackingListener nativeTrackingListener8 = c12682a.f33622f;
                                if (nativeTrackingListener8 != null) {
                                    nativeTrackingListener8.onStartRedirection(campaignEx, campaignEx.getClickURL());
                                }
                                appletsModel.requestWxAppletsScheme(1, c12682a.m34600a(c12682a.f33622f, campaignEx, appletsModel, c12682a));
                                return;
                            }
                            if (!TextUtils.isEmpty(appletsModel.getReBuildClickUrl())) {
                                campaignEx.setClickURL(appletsModel.getReBuildClickUrl());
                            }
                        }
                    }
                }
                if (C13884b.m41422b()) {
                    C12683b.m34647a(c12682a.f33620d, c12682a.f33617a, campaignEx, str, -1);
                }
                if (!campaignEx.getUserActivation() && C12684c.m34656a(c12682a.f33620d, campaignEx.getPackageName())) {
                    C12684c.m34658b(c12682a.f33620d, campaignEx.getPackageName());
                    if (C13884b.m41421a()) {
                        C12683b.m34647a(c12682a.f33620d, c12682a.f33617a, campaignEx, str, C13088a.f35848N);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener9 = c12682a.f33622f;
                    if (nativeTrackingListener9 != null) {
                        nativeTrackingListener9.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    if (C13884b.m41421a()) {
                        c12682a.m34617a(campaignEx, true, Boolean.TRUE, (List<String>) arrayList);
                    } else {
                        c12682a.m34617a(campaignEx, true, (Boolean) null, (List<String>) arrayList);
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener10 = c12682a.f33622f;
                    if (nativeTrackingListener10 != null) {
                        nativeTrackingListener10.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        C13227u0.m37859a(c12682a.f33622f);
                        return;
                    }
                    return;
                }
                int linkType = campaignEx.getLinkType();
                int iM34623b = c12682a.m34623b();
                if (C13884b.m41421a() && linkType != 3) {
                    C12683b.m34647a(c12682a.f33620d, c12682a.f33617a, campaignEx, str, -1);
                }
                boolean z = linkType == 8 || linkType == 9 || linkType == 4;
                String clickURL = campaignEx.getClickURL();
                if (!TextUtils.isEmpty(clickURL) && (clickURL.startsWith("market://") || clickURL.startsWith("https://play.google.com/"))) {
                    arrayList.add("google_play");
                    NativeListener.NativeTrackingListener nativeTrackingListener11 = c12682a.f33622f;
                    if (nativeTrackingListener11 != null) {
                        nativeTrackingListener11.onStartRedirection(campaignEx, campaignEx.getClickURL());
                    }
                    if (C13227u0.a.m37866a(c12682a.f33620d, campaignEx.getClickURL(), c12682a.f33622f)) {
                        c12682a.m34613a(jumpLoaderResultM36640b, campaignEx, false);
                        NativeListener.NativeTrackingListener nativeTrackingListener12 = c12682a.f33622f;
                        if (nativeTrackingListener12 != null) {
                            nativeTrackingListener12.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        }
                        c12682a.m34614a(campaignEx, 1, 1, arrayList);
                        return;
                    }
                    c12682a.m34604a(iM34623b, campaignEx.getClickURL(), campaignEx, c12682a.f33622f, arrayList);
                    c12682a.m34613a(jumpLoaderResultM36640b, campaignEx, false);
                    NativeListener.NativeTrackingListener nativeTrackingListener13 = c12682a.f33622f;
                    if (nativeTrackingListener13 != null) {
                        nativeTrackingListener13.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                if (!z) {
                    if (linkType == 2) {
                        if (C13884b.m41421a()) {
                            c12682a.m34617a(campaignEx, false, Boolean.TRUE, (List<String>) arrayList);
                            return;
                        } else {
                            c12682a.m34617a(campaignEx, false, (Boolean) null, (List<String>) arrayList);
                            return;
                        }
                    }
                    if (linkType == 3) {
                        arrayList.add("apk");
                        if (!C13884b.m41421a()) {
                            c12682a.m34617a(campaignEx, false, (Boolean) null, (List<String>) arrayList);
                            return;
                        } else {
                            c12682a.m34617a(campaignEx, false, Boolean.TRUE, (List<String>) arrayList);
                            c12682a.m34614a(campaignEx, 2, 1, arrayList);
                            return;
                        }
                    }
                    String clickURL2 = campaignEx.getClickURL();
                    NativeListener.NativeTrackingListener nativeTrackingListener14 = c12682a.f33622f;
                    if (nativeTrackingListener14 != null) {
                        nativeTrackingListener14.onStartRedirection(campaignEx, clickURL2);
                    }
                    if (TextUtils.isEmpty(clickURL2)) {
                        NativeListener.NativeTrackingListener nativeTrackingListener15 = c12682a.f33622f;
                        if (nativeTrackingListener15 != null) {
                            nativeTrackingListener15.onRedirectionFailed(campaignEx, clickURL2);
                        }
                        c12682a.m34613a(jumpLoaderResultM36640b, campaignEx, true);
                        return;
                    }
                    NativeListener.NativeTrackingListener nativeTrackingListener16 = c12682a.f33622f;
                    if (nativeTrackingListener16 != null) {
                        nativeTrackingListener16.onFinishRedirection(campaignEx, clickURL2);
                    }
                    C13227u0.m37857a(c12682a.f33620d, clickURL2, c12682a.f33622f, campaignEx, arrayList);
                    if (C13884b.m41421a()) {
                        c12682a.m34613a(jumpLoaderResultM36640b, campaignEx, false);
                        return;
                    } else {
                        c12682a.m34613a(jumpLoaderResultM36640b, campaignEx, true);
                        return;
                    }
                }
                String clickURL3 = campaignEx.getClickURL();
                NativeListener.NativeTrackingListener nativeTrackingListener17 = c12682a.f33622f;
                if (nativeTrackingListener17 != null) {
                    nativeTrackingListener17.onStartRedirection(campaignEx, clickURL3);
                }
                if (TextUtils.isEmpty(clickURL3)) {
                    NativeListener.NativeTrackingListener nativeTrackingListener18 = c12682a.f33622f;
                    if (nativeTrackingListener18 != null) {
                        nativeTrackingListener18.onRedirectionFailed(campaignEx, clickURL3);
                    }
                    c12682a.m34613a(jumpLoaderResultM36640b, campaignEx, true);
                    return;
                }
                if (linkType == 8) {
                    if (campaignEx.getAabEntity() == null || campaignEx.getAabEntity().getHlp() != 1) {
                        C13227u0.m37855a(c12682a.f33620d, clickURL3, campaignEx, c12682a.f33622f, arrayList);
                        NativeListener.NativeTrackingListener nativeTrackingListener19 = c12682a.f33622f;
                        if (nativeTrackingListener19 != null) {
                            nativeTrackingListener19.onFinishRedirection(campaignEx, clickURL3);
                        }
                    } else {
                        BaseTrackingListener baseTrackingListener = c12682a.f33622f;
                        if (baseTrackingListener == null && (baseTrackingListener = c12682a.f33629m) != null) {
                            baseTrackingListener.onStartRedirection(campaignEx, clickURL3);
                        }
                        try {
                            C13227u0.m37854a(c12682a.f33620d, clickURL3, campaignEx, c12682a, baseTrackingListener, arrayList);
                            c12682a = c12682a;
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                    c12682a.m34613a(jumpLoaderResultM36640b, campaignEx, false);
                    return;
                }
                if (linkType == 9) {
                    C13227u0.m37857a(c12682a.f33620d, clickURL3, c12682a.f33622f, campaignEx, arrayList);
                    c12682a.m34613a(jumpLoaderResultM36640b, campaignEx, false);
                    NativeListener.NativeTrackingListener nativeTrackingListener20 = c12682a.f33622f;
                    if (nativeTrackingListener20 != null) {
                        nativeTrackingListener20.onFinishRedirection(campaignEx, clickURL3);
                        return;
                    }
                    return;
                }
                if (linkType == 4) {
                    if (iM34623b == 2) {
                        C13227u0.m37855a(c12682a.f33620d, clickURL3, campaignEx, c12682a.f33622f, arrayList);
                    } else {
                        C13227u0.m37857a(c12682a.f33620d, clickURL3, c12682a.f33622f, campaignEx, arrayList);
                    }
                }
                NativeListener.NativeTrackingListener nativeTrackingListener21 = c12682a.f33622f;
                if (nativeTrackingListener21 != null) {
                    nativeTrackingListener21.onFinishRedirection(campaignEx, clickURL3);
                }
                c12682a.m34613a(jumpLoaderResultM36640b, campaignEx, false);
                return;
            }
            return;
        } catch (Throwable th2) {
            th = th2;
        }
        if (MBridgeConstans.DEBUG) {
            C13219q0.m37817b("CommonClickControl", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m34634a(CampaignEx campaignEx, NativeListener.NativeAdListener nativeAdListener) {
        if (nativeAdListener != null && campaignEx != null) {
            nativeAdListener.onAdClick(campaignEx);
        }
        m34633a(campaignEx);
    }

    /* JADX INFO: renamed from: a */
    public void m34635a(Campaign campaign, String str) {
        try {
            if (!TextUtils.isEmpty(str) && campaign != null) {
                CampaignEx campaignEx = campaign instanceof CampaignEx ? (CampaignEx) campaign : null;
                if (!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) {
                    C12683b.m34651a(str, this.f33620d, this.f33617a, campaignEx, this.f33622f);
                    return;
                }
                if (C13227u0.a.m37866a(this.f33620d, str, this.f33622f) || campaignEx == null) {
                    return;
                }
                if (TextUtils.isEmpty(campaignEx.getPackageName())) {
                    if (m34623b() == 2) {
                        C13227u0.m37855a(this.f33620d, campaignEx.getClickURL(), campaignEx, this.f33622f, new ArrayList());
                        return;
                    } else {
                        C13227u0.m37857a(this.f33620d, campaignEx.getClickURL(), this.f33622f, campaignEx, new ArrayList());
                        return;
                    }
                }
                C13227u0.a.m37866a(this.f33620d, "market://details?id=" + campaignEx.getPackageName(), this.f33622f);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m34636a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f33622f = nativeTrackingListener;
    }

    /* JADX INFO: renamed from: a */
    public void m34637a(String str) {
        this.f33617a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m34638a(boolean z) {
        this.f33627k = z;
    }

    /* JADX INFO: renamed from: b */
    public boolean m34639b(CampaignEx campaignEx) {
        Long l;
        if (campaignEx == null) {
            return true;
        }
        try {
            if (2 != campaignEx.getLinkType() && 3 != campaignEx.getLinkType()) {
                return true;
            }
            String id = campaignEx.getId();
            Map<String, Long> map = f33615o;
            if (map == null) {
                return true;
            }
            if (map.containsKey(id) && (l = f33615o.get(id)) != null) {
                if (l.longValue() > System.currentTimeMillis() || f33616p.contains(campaignEx.getId())) {
                    return false;
                }
            }
            f33615o.put(campaignEx.getId(), Long.valueOf(System.currentTimeMillis() + ((long) (campaignEx.getClickTimeOutInterval() * 1000))));
            return true;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            e2.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m34640c() {
        try {
            this.f33622f = null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m34641c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String currentLocalRid = campaignEx.getCurrentLocalRid();
            if (campaignEx.getLocalAllowTrackClick() == 0) {
                try {
                    C13154c c13154cM37489b = C13156d.m37475b().m37489b(currentLocalRid);
                    if (c13154cM37489b != null) {
                        c13154cM37489b.m37419a(c13154cM37489b.m37463t() + "m_check_local_c");
                    }
                } catch (Exception unused) {
                    C13219q0.m37816b("CommonClickControl", "sendClickStateToAnl error");
                }
            }
            C13154c c13154cM37489b2 = C13156d.m37475b().m37489b(currentLocalRid);
            c13154cM37489b2.m37421a(campaignEx);
            C13156d.m37475b().m37484a("m_check_local_c", c13154cM37489b2);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("CommonClickControl", th.getMessage(), th);
            }
        }
    }
}
