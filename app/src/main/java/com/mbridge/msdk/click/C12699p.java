package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.click.entity.C12687a;
import com.mbridge.msdk.click.entity.C12688b;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a;
import com.mbridge.msdk.foundation.same.task.C13164b;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.setting.C13630b;
import com.mbridge.msdk.util.C13884b;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.mbridge.msdk.click.p */
/* JADX INFO: compiled from: WebViewSpiderLoader.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12699p extends C12689f implements AbstractRunnableC13163a.a {

    /* JADX INFO: renamed from: b */
    private InterfaceC12690g f33736b;

    /* JADX INFO: renamed from: c */
    private JumpLoaderResult f33737c;

    /* JADX INFO: renamed from: e */
    private boolean f33739e;

    /* JADX INFO: renamed from: f */
    private Context f33740f;

    /* JADX INFO: renamed from: g */
    private C13164b f33741g;

    /* JADX INFO: renamed from: h */
    private C12687a f33742h;

    /* JADX INFO: renamed from: d */
    private boolean f33738d = true;

    /* JADX INFO: renamed from: i */
    private Handler f33743i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mbridge.msdk.click.p$a */
    /* JADX INFO: compiled from: WebViewSpiderLoader.java */
    class a implements InterfaceC12694k {
        a() {
        }

        @Override // com.mbridge.msdk.click.InterfaceC12694k
        /* JADX INFO: renamed from: a */
        public void mo34687a(JumpLoaderResult jumpLoaderResult) {
            C12699p.this.f33737c = jumpLoaderResult;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.p$b */
    /* JADX INFO: compiled from: WebViewSpiderLoader.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C12699p.this.f33736b != null) {
                if (C12699p.this.f33737c.isSuccess()) {
                    C12699p.this.f33736b.mo34642a(C12699p.this.f33737c);
                } else {
                    C12699p.this.f33736b.mo34643a(C12699p.this.f33737c, C12699p.this.f33737c.getMsg());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.p$c */
    /* JADX INFO: compiled from: WebViewSpiderLoader.java */
    private class c extends AbstractRunnableC13163a {

        /* JADX INFO: renamed from: b */
        private final Context f33747b;

        /* JADX INFO: renamed from: c */
        private String f33748c;

        /* JADX INFO: renamed from: d */
        private String f33749d;

        /* JADX INFO: renamed from: e */
        private String f33750e;

        /* JADX INFO: renamed from: f */
        private CampaignEx f33751f;

        /* JADX INFO: renamed from: g */
        private boolean f33752g;

        /* JADX INFO: renamed from: h */
        private boolean f33753h;

        /* JADX INFO: renamed from: i */
        private int f33754i;

        /* JADX INFO: renamed from: a */
        private final Semaphore f33746a = new Semaphore(0);

        /* JADX INFO: renamed from: j */
        private C12698o.f f33755j = new a();

        /* JADX INFO: renamed from: com.mbridge.msdk.click.p$c$a */
        /* JADX INFO: compiled from: WebViewSpiderLoader.java */
        class a implements C12698o.f {
            a() {
            }

            /* JADX INFO: renamed from: a */
            private void m34764a() {
                synchronized (C12699p.this) {
                    C12699p.this.f33737c.setSuccess(true);
                    c.this.m34755a();
                }
            }

            @Override // com.mbridge.msdk.click.C12698o.f
            /* JADX INFO: renamed from: a */
            public void mo34699a(int i, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    C12699p.this.f33737c.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    C12699p.this.f33737c.setContent(str3);
                }
                c.this.m34763d(str);
                m34764a();
            }

            @Override // com.mbridge.msdk.click.C12698o.f
            /* JADX INFO: renamed from: a */
            public void mo34700a(String str, boolean z, String str2) {
                c.this.m34763d(str);
                C12699p.this.f33737c.setContent(str2);
                m34764a();
            }

            @Override // com.mbridge.msdk.click.C12698o.f
            /* JADX INFO: renamed from: a */
            public boolean mo34701a(String str) {
                boolean zM34763d = c.this.m34763d(str);
                if (zM34763d) {
                    m34764a();
                }
                return zM34763d;
            }

            @Override // com.mbridge.msdk.click.C12698o.f
            /* JADX INFO: renamed from: b */
            public boolean mo34702b(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.C12698o.f
            /* JADX INFO: renamed from: c */
            public boolean mo34703c(String str) {
                boolean zM34763d = c.this.m34763d(str);
                if (zM34763d) {
                    m34764a();
                }
                return zM34763d;
            }
        }

        public c(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z, boolean z2, int i) {
            this.f33747b = context;
            this.f33748c = str;
            this.f33749d = str2;
            this.f33750e = str3;
            this.f33751f = campaignEx;
            this.f33752g = z;
            this.f33753h = z2;
            this.f33754i = i;
        }

        /* JADX INFO: renamed from: a */
        private JumpLoaderResult m34754a(String str, boolean z, boolean z2, CampaignEx campaignEx, int i) {
            String scheme;
            String str2;
            String scheme2 = "";
            if (C12699p.this.f33739e) {
                String strM39382a = C13630b.m39382a(this.f33747b, str);
                if (!TextUtils.isEmpty(strM39382a)) {
                    str = str + strM39382a;
                }
            }
            if (C13884b.m41421a()) {
                str = C12700q.m34765a(this.f33751f, str);
            }
            JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
            C12692i c12692i = new C12692i();
            try {
                if (m34761b(str)) {
                    str2 = "";
                } else {
                    URI uriCreate = URI.create(str);
                    scheme = uriCreate.getScheme();
                    try {
                        scheme2 = uriCreate.getHost();
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                    }
                    str2 = scheme2;
                    scheme2 = scheme;
                }
            } catch (Exception e2) {
                e = e2;
                scheme = "";
            }
            String strM34765a = str;
            String host = str2;
            for (int i2 = 0; i2 < 10; i2++) {
                if (!C12699p.this.f33738d) {
                    return null;
                }
                C12699p.this.f33742h = c12692i.m34686a(strM34765a, z, z2, campaignEx);
                if (C12699p.this.f33742h == null) {
                    jumpLoaderResult.setUrl(strM34765a);
                    jumpLoaderResult.setSuccess(false);
                    jumpLoaderResult.setMsg("request url is invalided");
                    break;
                }
                if (!TextUtils.isEmpty(C12699p.this.f33742h.f33666h)) {
                    jumpLoaderResult.setUrl(strM34765a);
                    jumpLoaderResult.setExceptionMsg(C12699p.this.f33742h.f33666h);
                    jumpLoaderResult.setType(1);
                    jumpLoaderResult.setHeader(C12699p.this.f33742h.m34666a());
                    jumpLoaderResult.setSuccess(false);
                    if (i2 != 0) {
                        break;
                    }
                    C12701a.m34779b().m34783a(strM34765a, C12699p.this.f33742h.f33666h, campaignEx, this.f33750e, z, z2, i);
                    break;
                }
                jumpLoaderResult.setSuccess(true);
                if (!m34760b(C12699p.this.f33742h.f33664f)) {
                    if (!m34757a(C12699p.this.f33742h.f33664f)) {
                        jumpLoaderResult.setjumpDone(false);
                        jumpLoaderResult.setUrl(strM34765a);
                        if (i2 != 0) {
                            break;
                        }
                        C12701a.m34779b().m34783a(strM34765a, "error code:" + C12699p.this.f33742h.f33664f, campaignEx, this.f33750e, z, z2, i);
                        break;
                    }
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(strM34765a);
                    jumpLoaderResult.setContent(C12699p.this.f33742h.f33665g);
                    break;
                }
                jumpLoaderResult.setIs302Jump(true);
                if (TextUtils.isEmpty(C12699p.this.f33742h.f33659a)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(strM34765a);
                    break;
                }
                strM34765a = C12699p.this.f33742h.f33659a;
                if (m34761b(strM34765a)) {
                    if (!m34762c(strM34765a) || TextUtils.isEmpty(scheme2) || TextUtils.isEmpty(host)) {
                        jumpLoaderResult.setjumpDone(true);
                        jumpLoaderResult.setUrl(strM34765a);
                        break;
                    }
                    strM34765a = scheme2 + "://" + host + strM34765a;
                    host = null;
                    scheme2 = null;
                } else if (!m34761b(strM34765a)) {
                    try {
                        URI uriCreate2 = URI.create(strM34765a);
                        scheme2 = uriCreate2.getScheme();
                        host = uriCreate2.getHost();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                if (m34759a(strM34765a)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(strM34765a);
                    break;
                }
                if (C12699p.this.f33739e) {
                    String strM39382a2 = C13630b.m39382a(this.f33747b, strM34765a);
                    if (!TextUtils.isEmpty(strM39382a2)) {
                        strM34765a = strM34765a + strM39382a2;
                    }
                }
                if (C13884b.m41421a()) {
                    strM34765a = C12700q.m34765a(this.f33751f, strM34765a);
                }
            }
            return jumpLoaderResult;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m34755a() {
            this.f33746a.release();
        }

        /* JADX INFO: renamed from: a */
        private boolean m34757a(int i) {
            return i == 200;
        }

        /* JADX INFO: renamed from: a */
        private boolean m34759a(String str) {
            return C13227u0.a.m37868b(str);
        }

        /* JADX INFO: renamed from: b */
        private boolean m34760b(int i) {
            return i == 301 || i == 302 || i == 307;
        }

        /* JADX INFO: renamed from: b */
        private boolean m34761b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        /* JADX INFO: renamed from: c */
        private boolean m34762c(String str) {
            return str.startsWith(RemoteSettings.FORWARD_SLASH_STRING);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public boolean m34763d(String str) {
            return C12700q.m34768a(str, this.f33751f, C12699p.this.f33737c);
        }

        @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
        public void pauseTask(boolean z) {
        }

        @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
        public void runTask() {
            if (C12699p.this.f33736b != null) {
                C12699p.this.f33736b.mo34644b(null);
            }
            C12699p.this.f33737c = new JumpLoaderResult();
            C12699p.this.f33737c.setUrl(this.f33748c);
            C12699p.this.f33737c = m34754a(this.f33748c, this.f33752g, this.f33753h, this.f33751f, this.f33754i);
            if (!TextUtils.isEmpty(C12699p.this.f33737c.getExceptionMsg())) {
                C12699p.this.f33737c.setSuccess(true);
            }
            if (C12699p.this.f33738d && C12699p.this.f33737c.isSuccess()) {
                if (C12699p.this.f33742h != null) {
                    C12699p.this.f33737c.setStatusCode(C12699p.this.f33742h.f33664f);
                }
                C12700q.m34766a(this.f33751f, C12699p.this.f33737c, C12699p.this.f33742h, this.f33749d, this.f33750e, this.f33747b, this.f33755j, this.f33746a);
            }
        }
    }

    public C12699p(Context context) {
        this.f33740f = context;
        this.f33741g = new C13164b(context, 2);
    }

    @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a.a
    /* JADX INFO: renamed from: a */
    public void mo34752a(AbstractRunnableC13163a.b bVar) {
        if (bVar == AbstractRunnableC13163a.b.FINISH && this.f33738d) {
            this.f33743i.post(new b());
        }
    }

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
    /* JADX INFO: renamed from: a */
    public void m34753a(String str, InterfaceC12690g interfaceC12690g, boolean z, String str2, String str3, CampaignEx campaignEx, boolean z2, boolean z3, int i) {
        AbstractRunnableC13163a cVar;
        this.f33736b = interfaceC12690g;
        this.f33739e = z;
        C12688b c12688b = new C12688b();
        c12688b.m34669a(this.f33740f);
        c12688b.m34677c(str);
        c12688b.m34675b(z);
        c12688b.m34671a(str2);
        c12688b.m34674b(str3);
        c12688b.m34670a(campaignEx);
        c12688b.m34672a(z2);
        c12688b.m34678c(z3);
        c12688b.m34668a(i);
        if (str.startsWith("tcp")) {
            C12695l c12695l = new C12695l(c12688b);
            c12695l.m34696a(this.f33736b);
            c12695l.m34697a(new a());
            cVar = c12695l;
        } else {
            cVar = new c(this.f33740f, str, str2, str3, campaignEx, z2, z3, i);
        }
        this.f33741g.m37536b(cVar, this);
    }
}
