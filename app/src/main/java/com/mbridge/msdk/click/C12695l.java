package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.webkit.ProxyConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.click.entity.C12687a;
import com.mbridge.msdk.click.entity.C12688b;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.setting.C13630b;
import com.mbridge.msdk.util.C13884b;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.mbridge.msdk.click.l */
/* JADX INFO: compiled from: SocketRequestTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12695l extends AbstractRunnableC13163a {

    /* JADX INFO: renamed from: b */
    private final Context f33688b;

    /* JADX INFO: renamed from: c */
    private final String f33689c;

    /* JADX INFO: renamed from: d */
    private final String f33690d;

    /* JADX INFO: renamed from: e */
    private final String f33691e;

    /* JADX INFO: renamed from: f */
    private final CampaignEx f33692f;

    /* JADX INFO: renamed from: g */
    private final boolean f33693g;

    /* JADX INFO: renamed from: h */
    private final boolean f33694h;

    /* JADX INFO: renamed from: i */
    private final int f33695i;

    /* JADX INFO: renamed from: j */
    private final boolean f33696j;

    /* JADX INFO: renamed from: k */
    private C12687a f33697k;

    /* JADX INFO: renamed from: l */
    private JumpLoaderResult f33698l;

    /* JADX INFO: renamed from: m */
    private InterfaceC12690g f33699m;

    /* JADX INFO: renamed from: n */
    private InterfaceC12694k f33700n;

    /* JADX INFO: renamed from: a */
    private final Semaphore f33687a = new Semaphore(0);

    /* JADX INFO: renamed from: o */
    private final C12698o.f f33701o = new a();

    /* JADX INFO: renamed from: com.mbridge.msdk.click.l$a */
    /* JADX INFO: compiled from: SocketRequestTask.java */
    class a implements C12698o.f {
        a() {
        }

        /* JADX INFO: renamed from: a */
        private void m34698a() {
            synchronized (this) {
                C12695l.this.f33698l.setSuccess(true);
                if (C12695l.this.f33700n != null) {
                    C12695l.this.f33700n.mo34687a(C12695l.this.f33698l);
                }
                C12695l.this.m34690a();
            }
        }

        @Override // com.mbridge.msdk.click.C12698o.f
        /* JADX INFO: renamed from: a */
        public void mo34699a(int i, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                C12695l.this.f33698l.setExceptionMsg(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                C12695l.this.f33698l.setContent(str3);
            }
            C12695l.this.m34693b(str);
            m34698a();
        }

        @Override // com.mbridge.msdk.click.C12698o.f
        /* JADX INFO: renamed from: a */
        public void mo34700a(String str, boolean z, String str2) {
            C12695l.this.m34693b(str);
            C12695l.this.f33698l.setContent(str2);
            m34698a();
        }

        @Override // com.mbridge.msdk.click.C12698o.f
        /* JADX INFO: renamed from: a */
        public boolean mo34701a(String str) {
            boolean zM34693b = C12695l.this.m34693b(str);
            if (zM34693b) {
                m34698a();
            }
            return zM34693b;
        }

        @Override // com.mbridge.msdk.click.C12698o.f
        /* JADX INFO: renamed from: b */
        public boolean mo34702b(String str) {
            return false;
        }

        @Override // com.mbridge.msdk.click.C12698o.f
        /* JADX INFO: renamed from: c */
        public boolean mo34703c(String str) {
            boolean zM34693b = C12695l.this.m34693b(str);
            if (zM34693b) {
                m34698a();
            }
            return zM34693b;
        }
    }

    public C12695l(C12688b c12688b) {
        this.f33688b = c12688b.m34676c();
        this.f33689c = c12688b.m34680e();
        this.f33690d = c12688b.m34673b();
        this.f33691e = c12688b.m34679d();
        this.f33692f = c12688b.m34667a();
        this.f33693g = c12688b.m34682g();
        this.f33694h = c12688b.m34684i();
        this.f33695i = c12688b.m34681f();
        this.f33696j = c12688b.m34683h();
    }

    /* JADX INFO: renamed from: a */
    private String m34689a(String str) {
        if (this.f33696j) {
            String strM39382a = C13630b.m39382a(this.f33688b, str);
            if (!TextUtils.isEmpty(strM39382a)) {
                str = str + strM39382a;
            }
        }
        return C13884b.m41421a() ? C12696m.m34704a(this.f33692f, str) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m34690a() {
        this.f33687a.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public boolean m34693b(String str) {
        return C12696m.m34706a(str, this.f33692f, this.f33698l);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0161 A[LOOP:0: B:16:0x003c->B:66:0x0161, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x015a A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    private JumpLoaderResult m34694c(String str) {
        String scheme;
        String str2;
        int i;
        String strM34689a = m34689a(str);
        JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
        C12697n c12697n = new C12697n();
        C12692i c12692i = new C12692i();
        String host = "";
        try {
            if (URLUtil.isNetworkUrl(strM34689a)) {
                URI uriCreate = URI.create(strM34689a);
                scheme = uriCreate.getScheme();
                try {
                    host = uriCreate.getHost();
                } catch (Exception e) {
                    e = e;
                    C13219q0.m37816b("SocketRequestTask", e.getMessage());
                }
                str2 = host;
                host = scheme;
            } else {
                str2 = "";
            }
        } catch (Exception e2) {
            e = e2;
            scheme = "";
        }
        String strM34689a2 = strM34689a;
        for (int i2 = 0; i2 < 10; i2++) {
            if (this.mState != AbstractRunnableC13163a.b.RUNNING) {
                return null;
            }
            if (strM34689a2.startsWith("tcp")) {
                this.f33697k = c12697n.m34709a(strM34689a2, this.f33692f, this.f33693g, this.f33694h);
                i = 3;
            } else {
                this.f33697k = c12692i.m34686a(strM34689a2, this.f33693g, this.f33694h, this.f33692f);
                i = 1;
            }
            C12687a c12687a = this.f33697k;
            if (c12687a == null) {
                jumpLoaderResult.setUrl(strM34689a2);
                jumpLoaderResult.setSuccess(false);
                break;
            }
            if (!TextUtils.isEmpty(c12687a.f33666h)) {
                jumpLoaderResult.setUrl(strM34689a2);
                jumpLoaderResult.setExceptionMsg(this.f33697k.f33666h);
                jumpLoaderResult.setType(i);
                jumpLoaderResult.setHeader(this.f33697k.m34666a());
                jumpLoaderResult.setSuccess(false);
                if (i2 != 0) {
                    break;
                }
                C12701a.m34779b().m34783a(strM34689a2, this.f33697k.f33666h, this.f33692f, this.f33691e, this.f33693g, this.f33694h, this.f33695i);
                break;
            }
            int i3 = this.f33697k.f33664f;
            if (i3 == 200) {
                jumpLoaderResult.setjumpDone(true);
                jumpLoaderResult.setUrl(strM34689a2);
                jumpLoaderResult.setSuccess(true);
                String str3 = this.f33697k.f33665g;
                jumpLoaderResult.setContent(str3 != null ? str3 : null);
                break;
            }
            if (i3 != 301 && i3 != 302 && i3 != 307) {
                jumpLoaderResult.setjumpDone(false);
                jumpLoaderResult.setUrl(strM34689a2);
                if (i2 != 0) {
                    break;
                }
                C12701a.m34779b().m34783a(strM34689a2, this.f33697k.f33666h, this.f33692f, this.f33691e, this.f33693g, this.f33694h, this.f33695i);
                break;
            }
            jumpLoaderResult.setSuccess(true);
            jumpLoaderResult.setIs302Jump(true);
            if (TextUtils.isEmpty(this.f33697k.f33659a)) {
                jumpLoaderResult.setjumpDone(true);
                jumpLoaderResult.setUrl(strM34689a2);
                break;
            }
            String str4 = this.f33697k.f33659a;
            if (str4.startsWith(ProxyConfig.MATCH_HTTP)) {
                if (C13227u0.a.m37868b(str4)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(str4);
                    break;
                }
                strM34689a2 = m34689a(str4);
            } else {
                if (!str4.startsWith(RemoteSettings.FORWARD_SLASH_STRING) || TextUtils.isEmpty(host) || TextUtils.isEmpty(str2)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(str4);
                    break;
                }
                str4 = host + "://" + str2 + str4;
                str2 = null;
                host = null;
                if (C13227u0.a.m37868b(str4)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(str4);
                    break;
                }
                strM34689a2 = m34689a(str4);
            }
        }
        return jumpLoaderResult;
    }

    /* JADX INFO: renamed from: a */
    public void m34696a(InterfaceC12690g interfaceC12690g) {
        this.f33699m = interfaceC12690g;
    }

    /* JADX INFO: renamed from: a */
    public void m34697a(InterfaceC12694k interfaceC12694k) {
        this.f33700n = interfaceC12694k;
    }

    @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
    public void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
    public void pauseTask(boolean z) {
    }

    @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
    public void runTask() {
        JumpLoaderResult jumpLoaderResult;
        InterfaceC12690g interfaceC12690g = this.f33699m;
        if (interfaceC12690g != null) {
            interfaceC12690g.mo34644b(null);
        }
        JumpLoaderResult jumpLoaderResult2 = new JumpLoaderResult();
        this.f33698l = jumpLoaderResult2;
        jumpLoaderResult2.setUrl(this.f33689c);
        JumpLoaderResult jumpLoaderResultM34694c = m34694c(this.f33689c);
        this.f33698l = jumpLoaderResultM34694c;
        if (jumpLoaderResultM34694c != null && !TextUtils.isEmpty(jumpLoaderResultM34694c.getExceptionMsg())) {
            this.f33698l.setSuccess(true);
        }
        if (this.mState != AbstractRunnableC13163a.b.RUNNING) {
            InterfaceC12694k interfaceC12694k = this.f33700n;
            if (interfaceC12694k != null) {
                interfaceC12694k.mo34687a(this.f33698l);
                return;
            }
            return;
        }
        JumpLoaderResult jumpLoaderResult3 = this.f33698l;
        if (jumpLoaderResult3 != null && !jumpLoaderResult3.isSuccess()) {
            InterfaceC12694k interfaceC12694k2 = this.f33700n;
            if (interfaceC12694k2 != null) {
                interfaceC12694k2.mo34687a(this.f33698l);
                return;
            }
            return;
        }
        C12687a c12687a = this.f33697k;
        if (c12687a != null && (jumpLoaderResult = this.f33698l) != null) {
            jumpLoaderResult.setStatusCode(c12687a.f33664f);
        }
        C12696m.m34705a(this.f33692f, this.f33698l, this.f33697k, this.f33690d, this.f33691e, this.f33688b, this.f33701o, this.f33700n, this.f33687a);
    }
}
