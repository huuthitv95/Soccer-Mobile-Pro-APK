package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.fyber.inneractive.sdk.flow.storepromo.model.C8208a;
import com.fyber.inneractive.sdk.flow.storepromo.model.C8210c;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.loader.e */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8193e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8192d f18245a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8194f f18246b;

    public RunnableC8193e(C8194f c8194f, C8192d c8192d) {
        this.f18246b = c8194f;
        this.f18245a = c8192d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8210c c8210c;
        C8194f c8194f = this.f18246b;
        if (c8194f.f18252f == null || (c8210c = c8194f.f18248b) == null) {
            return;
        }
        C8192d c8192d = this.f18245a;
        StringBuilder sb = new StringBuilder("\n<script>\n");
        ArrayList<C8208a> arrayList = c8210c.f18295a;
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        int i2 = 0;
        for (C8208a c8208a : arrayList) {
            int i3 = AbstractC8196h.f18262a[c8208a.f18292a.ordinal()];
            if (i3 == 1) {
                i++;
                String str = C8197i.f18263a;
                String str2 = String.format("app_screen_%d", Integer.valueOf(i));
                sb2.append("var " + str2 + "_el = document.createElement('img');\n" + str2 + "_el.id = '" + str2 + "';\ndocument.getElementById('carousel').appendChild(" + str2 + "_el);\n");
                sb2.append(String.format(C8197i.f18263a, Integer.valueOf(i), c8208a.f18293b));
                sb2.append(String.format(C8197i.f18264b, Integer.valueOf(i), Integer.valueOf(i)));
            } else if (i3 == 2) {
                i2++;
                String str3 = C8197i.f18263a;
                String str4 = String.format("app_video_url_%d", Integer.valueOf(i2));
                sb2.append("var " + str4 + "_el = document.createElement('video');\n" + str4 + "_el.id = '" + str4 + "';\ndocument.getElementById('carousel').appendChild(" + str4 + "_el);\n");
                sb2.append(String.format(C8197i.f18265c, Integer.valueOf(i2), c8208a.f18293b));
                sb2.append(String.format(C8197i.f18266d, Integer.valueOf(i2), Integer.valueOf(i2)));
            } else if (i3 == 3) {
                sb2.append(String.format(C8197i.f18267e, c8208a.f18293b));
                sb2.append(C8197i.f18268f);
            } else if (i3 == 4) {
                sb2.append(String.format(C8197i.f18279q, c8208a.f18293b));
                sb2.append(C8197i.f18280r);
            }
        }
        sb.append(sb2.toString());
        sb.append(String.format(C8197i.f18269g, c8210c.f18296b.replace("`", "\\`")) + C8197i.f18270h + String.format(C8197i.f18271i, c8210c.f18300f.replace("`", "\\`")) + C8197i.f18272j + String.format(C8197i.f18273k, c8210c.f18301g.f18305b.replace("`", "\\`")) + C8197i.f18274l + String.format(C8197i.f18277o, c8210c.f18301g.f18304a.replace("`", "\\`")) + C8197i.f18278p + String.format(C8197i.f18275m, c8210c.f18301g.f18306c.replace("`", "\\`")) + C8197i.f18276n);
        StringBuilder sb3 = new StringBuilder();
        boolean z = Boolean.parseBoolean(c8210c.f18298d);
        boolean z2 = Boolean.parseBoolean(c8210c.f18299e);
        sb3.append(C8197i.m20618a(z, "in_app_purchases"));
        sb3.append(C8197i.m20618a(z2, "app_contains_ads"));
        sb3.append(C8197i.m20618a(z2 && z, "app_subtitle_separator"));
        sb.append(sb3.toString());
        sb.append("</script>");
        String str5 = c8210c.f18297c + sb.toString();
        c8192d.getClass();
        AbstractC9183r.f21478b.post(new RunnableC8191c(c8192d, str5));
    }
}
