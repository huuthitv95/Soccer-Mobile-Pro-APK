package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbbanner.common.listener.InterfaceC13283b;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.util.a */
/* JADX INFO: compiled from: BannerDelivery.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13294a {

    /* JADX INFO: renamed from: c */
    private static final String f36738c = "a";

    /* JADX INFO: renamed from: a */
    private final Handler f36739a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    private boolean f36740b;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.util.a$a */
    /* JADX INFO: compiled from: BannerDelivery.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC13283b f36741a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f36742b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CampaignUnit f36743c;

        a(InterfaceC13283b interfaceC13283b, String str, CampaignUnit campaignUnit) {
            this.f36741a = interfaceC13283b;
            this.f36742b = str;
            this.f36743c = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC13283b interfaceC13283b = this.f36741a;
            if (interfaceC13283b != null) {
                interfaceC13283b.mo38177a(this.f36742b, this.f36743c, C13294a.this.f36740b);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.util.a$b */
    /* JADX INFO: compiled from: BannerDelivery.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC13283b f36745a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C13082b f36746b;

        b(InterfaceC13283b interfaceC13283b, C13082b c13082b) {
            this.f36745a = interfaceC13283b;
            this.f36746b = c13082b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f36745a != null) {
                this.f36746b.m37022a(C13294a.this.f36740b);
                this.f36745a.mo38175a(this.f36746b);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.util.a$c */
    /* JADX INFO: compiled from: BannerDelivery.java */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC13283b f36748a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f36749b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36750c;

        c(InterfaceC13283b interfaceC13283b, String str, int i) {
            this.f36748a = interfaceC13283b;
            this.f36749b = str;
            this.f36750c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC13283b interfaceC13283b = this.f36748a;
            if (interfaceC13283b != null) {
                interfaceC13283b.mo38176a(this.f36749b, this.f36750c, C13294a.this.f36740b);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.util.a$d */
    /* JADX INFO: compiled from: BannerDelivery.java */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC13283b f36752a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C13082b f36753b;

        d(InterfaceC13283b interfaceC13283b, C13082b c13082b) {
            this.f36752a = interfaceC13283b;
            this.f36753b = c13082b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f36752a != null) {
                this.f36753b.m37022a(C13294a.this.f36740b);
                this.f36752a.mo38178b(this.f36753b);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m38301b(InterfaceC13283b interfaceC13283b, C13082b c13082b) {
        C13219q0.m37816b(f36738c, "postResourceFail unitId=" + c13082b);
        this.f36739a.post(new d(interfaceC13283b, c13082b));
    }

    /* JADX INFO: renamed from: a */
    public void m38300a(boolean z) {
        this.f36740b = z;
    }

    /* JADX INFO: renamed from: a */
    public void m38297a(InterfaceC13283b interfaceC13283b, CampaignUnit campaignUnit, String str) {
        C13219q0.m37816b(f36738c, "postCampaignSuccess unitId=" + str);
        this.f36739a.post(new a(interfaceC13283b, str, campaignUnit));
    }

    /* JADX INFO: renamed from: a */
    public void m38298a(InterfaceC13283b interfaceC13283b, C13082b c13082b) {
        this.f36739a.post(new b(interfaceC13283b, c13082b));
    }

    /* JADX INFO: renamed from: a */
    public void m38299a(InterfaceC13283b interfaceC13283b, String str, int i) {
        C13219q0.m37816b(f36738c, "postResourceSuccess unitId=" + str);
        this.f36739a.post(new c(interfaceC13283b, str, i));
    }
}
