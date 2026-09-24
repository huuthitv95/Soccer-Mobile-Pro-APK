package com.mbridge.msdk.video.dynview.util.draw;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13181a0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.video.dynview.C13942c;
import com.mbridge.msdk.video.dynview.shape.C13973a;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a */
/* JADX INFO: compiled from: ChoiceOneDrawBitBg.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13977a {

    /* JADX INFO: renamed from: d */
    private static volatile C13977a f40079d;

    /* JADX INFO: renamed from: a */
    private View f40080a;

    /* JADX INFO: renamed from: b */
    private Bitmap f40081b;

    /* JADX INFO: renamed from: c */
    private Bitmap f40082c;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a */
    /* JADX INFO: compiled from: ChoiceOneDrawBitBg.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Bitmap f40083a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f40084b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f40085c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ float f40086d;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ChoiceOneDrawBitBg.java */
        class RunnableC15565a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C13973a.b f40088a;

            RunnableC15565a(C13973a.b bVar) {
                this.f40088a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C13977a.this.f40080a == null || this.f40088a.build() == null) {
                    return;
                }
                C13977a.this.f40080a.setBackground(this.f40088a.build());
            }
        }

        a(Bitmap bitmap, int i, float f, float f2) {
            this.f40083a = bitmap;
            this.f40084b = i;
            this.f40085c = f;
            this.f40086d = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap bitmapM37594a = C13181a0.m37594a(this.f40083a, 10);
                Bitmap bitmapM37594a2 = C13181a0.m37594a(this.f40083a, 10);
                C13973a.b bVarM41819a = C13973a.m41819a();
                bVarM41819a.orientation(this.f40084b).mo41838b(bitmapM37594a).mo41835a(bitmapM37594a2);
                if (this.f40084b == 2) {
                    float f = this.f40085c;
                    float f2 = this.f40086d;
                    if (f > f2) {
                        bVarM41819a.m41837b(f).mo41833a(this.f40086d);
                    } else {
                        bVarM41819a.m41837b(f2).mo41833a(this.f40085c);
                    }
                } else {
                    bVarM41819a.m41837b(this.f40085c).mo41833a(this.f40086d);
                }
                if (C13977a.this.f40080a != null) {
                    C13977a.this.f40080a.post(new RunnableC15565a(bVarM41819a));
                }
            } catch (Exception e) {
                C13219q0.m37816b("ChoiceOneDrawBitBg", e.getMessage());
            }
        }
    }

    private C13977a() {
    }

    /* JADX INFO: renamed from: a */
    public static C13977a m41865a() {
        C13977a c13977a;
        if (f40079d != null) {
            return f40079d;
        }
        synchronized (C13977a.class) {
            if (f40079d == null) {
                f40079d = new C13977a();
            }
            c13977a = f40079d;
        }
        return c13977a;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m41866a(int i, float f, float f2, Bitmap bitmap, Bitmap bitmap2) throws Throwable {
        try {
            try {
                try {
                    C13167a.m37542a().execute(new a(bitmap, i, f, f2));
                } catch (Exception e) {
                    e = e;
                    C13219q0.m37813a("ChoiceOneDrawBitBg", e.getMessage());
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41867a(Map<String, Bitmap> map, C13942c c13942c, View view) {
        if (view == null || c13942c == null || map == null || map.size() == 0 || map.size() < 2 || c13942c.m41706b() == null || c13942c.m41706b().size() < 2) {
            return;
        }
        this.f40080a = view;
        int iM41712h = c13942c.m41712h();
        float fM41717m = c13942c.m41717m();
        float fM41715k = c13942c.m41715k();
        try {
            List<CampaignEx> listM41706b = c13942c.m41706b();
            String md5 = listM41706b.get(0) != null ? SameMD5.getMD5(listM41706b.get(0).getImageUrl()) : "";
            String md6 = listM41706b.get(1) != null ? SameMD5.getMD5(listM41706b.get(1).getImageUrl()) : "";
            Bitmap bitmap = null;
            Bitmap bitmap2 = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            if (!TextUtils.isEmpty(md6) && map.containsKey(md6)) {
                bitmap = map.get(md6);
            }
            Bitmap bitmap3 = bitmap;
            if (bitmap2 == null || bitmap2.isRecycled() || bitmap3 == null || bitmap3.isRecycled()) {
                return;
            }
            m41866a(iM41712h, fM41717m, fM41715k, bitmap2, bitmap3);
        } catch (Exception e) {
            C13219q0.m37816b("ChoiceOneDrawBitBg", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m41868b() {
        if (this.f40080a != null) {
            this.f40080a = null;
        }
        Bitmap bitmap = this.f40081b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f40081b.recycle();
            this.f40081b = null;
        }
        Bitmap bitmap2 = this.f40082c;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.f40082c.recycle();
        this.f40082c = null;
    }
}
