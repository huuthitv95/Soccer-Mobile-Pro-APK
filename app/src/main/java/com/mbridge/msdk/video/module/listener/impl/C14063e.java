package com.mbridge.msdk.video.module.listener.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13026n;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.e */
/* JADX INFO: compiled from: DefaultImageLoaderListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14063e implements InterfaceC13101c {

    /* JADX INFO: renamed from: a */
    protected ImageView f40535a;

    /* JADX INFO: renamed from: b */
    private CampaignEx f40536b;

    /* JADX INFO: renamed from: c */
    private String f40537c;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.e$a */
    /* JADX INFO: compiled from: DefaultImageLoaderListener.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f40538a;

        a(String str) {
            this.f40538a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13026n c13026nM36744a = C13026n.m36744a(C13017g.m36693a(C13008c.m36588n().m36542d()));
                if (C14063e.this.f40536b == null) {
                    C13219q0.m37813a("ImageLoaderListener", "campaign is null");
                    return;
                }
                C13080n c13080n = new C13080n();
                c13080n.m36982j("2000044");
                c13080n.m36965c(C13211m0.m37770s(C13008c.m36588n().m36542d()));
                c13080n.m36962b(C14063e.this.f40536b.getId());
                c13080n.m36980i(C14063e.this.f40536b.getImageUrl());
                c13080n.m36990n(C14063e.this.f40536b.getRequestId());
                c13080n.m36992o(C14063e.this.f40536b.getRequestIdNotice());
                c13080n.m37004u(C14063e.this.f40537c);
                c13080n.m36988m(this.f40538a);
                c13026nM36744a.m36745a(c13080n);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public C14063e(ImageView imageView) {
        this.f40535a = imageView;
    }

    public C14063e(ImageView imageView, CampaignEx campaignEx, String str) {
        this.f40535a = imageView;
        this.f40536b = campaignEx;
        this.f40537c = str;
    }

    @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
    public void onFailedLoad(String str, String str2) {
        a aVar = new a(str);
        if (C13009d.m36589a().m36605e()) {
            C13167a.m37543b().execute(aVar);
        } else {
            aVar.run();
        }
        C13219q0.m37816b("ImageLoaderListener", "desc:" + str);
    }

    @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        try {
            if (bitmap == null) {
                C13219q0.m37816b("ImageLoaderListener", "bitmap=null");
            } else {
                if (this.f40535a == null || bitmap.isRecycled()) {
                    return;
                }
                this.f40535a.setImageBitmap(bitmap);
                this.f40535a.setVisibility(0);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }
}
