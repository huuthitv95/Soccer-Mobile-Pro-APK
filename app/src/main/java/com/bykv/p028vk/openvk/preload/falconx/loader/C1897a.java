package com.bykv.p028vk.openvk.preload.falconx.loader;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.p045e.C1952b;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.falconx.loader.a */
/* JADX INFO: compiled from: GeckoResLoader.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1897a implements ILoader {

    /* JADX INFO: renamed from: a */
    private C1952b f4286a;

    /* JADX INFO: renamed from: b */
    private AtomicBoolean f4287b = new AtomicBoolean(false);

    public C1897a(Context context, String str, File file) {
        if (context == null) {
            throw new RuntimeException("context == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("access key empty");
        }
        if (file == null) {
            throw new RuntimeException("resRootDir == null");
        }
        this.f4286a = new C1952b(context, str, file);
    }

    /* JADX INFO: renamed from: a */
    public final int m5885a(String str) throws Exception {
        if (this.f4287b.get()) {
            throw new RuntimeException("released!");
        }
        return this.f4286a.m6020b(str);
    }

    @Override // com.bykv.p028vk.openvk.preload.falconx.loader.ILoader
    public boolean exist(String str) throws Exception {
        if (this.f4287b.get()) {
            throw new RuntimeException("released!");
        }
        return this.f4286a.m6023c(str);
    }

    @Override // com.bykv.p028vk.openvk.preload.falconx.loader.ILoader
    public Map<String, Long> getChannelVersion() {
        return this.f4286a.m6021b();
    }

    @Override // com.bykv.p028vk.openvk.preload.falconx.loader.ILoader
    public InputStream getInputStream(String str) throws Exception {
        if (this.f4287b.get()) {
            throw new RuntimeException("released!");
        }
        GeckoLogger.m6040d("WebOffline-falcon", "GeckoResLoader ready to load, file:", str);
        return this.f4286a.m6018a(str);
    }

    @Override // com.bykv.p028vk.openvk.preload.falconx.loader.ILoader
    public String getResRootDir() {
        return this.f4286a.m6019a();
    }

    @Override // com.bykv.p028vk.openvk.preload.falconx.loader.ILoader
    public void release() throws Exception {
        if (this.f4287b.getAndSet(true)) {
            return;
        }
        this.f4286a.m6022c();
    }
}
