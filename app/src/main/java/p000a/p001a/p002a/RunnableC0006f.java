package p000a.p001a.p002a;

import android.content.Intent;
import android.net.Uri;
import com.gadsme.nativeplugin.Plugin;
import com.gadsme.nativeplugin.WebTexture;

/* JADX INFO: renamed from: a.a.a.f */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0006f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f6a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ WebTexture f7b;

    public RunnableC0006f(WebTexture webTexture, String str) {
        this.f7b = webTexture;
        this.f6a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f7b.f21775a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f6a)));
            if (this.f7b.f21785k) {
                return;
            }
            this.f7b.f21785k = true;
            Plugin.SendMessage("WebTexture", this.f7b.f21796v, "pageClickVisited");
        } catch (Throwable unused) {
        }
    }
}
