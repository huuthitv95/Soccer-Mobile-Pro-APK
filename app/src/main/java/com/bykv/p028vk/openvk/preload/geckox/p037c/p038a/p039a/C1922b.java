package com.bykv.p028vk.openvk.preload.geckox.p037c.p038a.p039a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.C1910b;
import com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a;
import com.bykv.p028vk.openvk.preload.geckox.buffer.p036a.C1914a;
import com.bykv.p028vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p028vk.openvk.preload.geckox.p035b.C1911a;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.a.a.b */
/* JADX INFO: compiled from: DownloadFullSingleFileInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1922b extends AbstractC1886d<Pair<Uri, UpdatePackage>, Pair<InterfaceC1913a, UpdatePackage>> {

    /* JADX INFO: renamed from: d */
    private C1910b f4383d;

    /* JADX INFO: renamed from: e */
    private File f4384e;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Object mo5832a(InterfaceC1882b<Pair<InterfaceC1913a, UpdatePackage>> interfaceC1882b, Pair<Uri, UpdatePackage> pair) throws Throwable {
        GeckoLogger.m6040d("gecko-debug-tag", "start download full single file channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String string = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        File file = new File(this.f4384e, updatePackage.getAccessKey() + File.separator + updatePackage.getChannel() + File.separator + updatePackage.getVersion() + "--updating");
        file.mkdirs();
        StringBuilder sb = new StringBuilder("res");
        sb.append(File.separator);
        sb.append(m5997a(updatePackage, string));
        File file2 = new File(file, sb.toString());
        this.f4383d.m5922a();
        InterfaceC1913a interfaceC1913aM5981a = C1914a.m5981a(file2, length);
        try {
            this.f4383d.m5929i().downloadFile(string, length, new BufferOutputStream(interfaceC1913aM5981a));
            try {
                try {
                    Object objMo5836a = interfaceC1882b.mo5836a(new Pair<>(interfaceC1913aM5981a, updatePackage));
                    try {
                        interfaceC1913aM5981a.mo5979e();
                        return objMo5836a;
                    } catch (Exception e) {
                        GeckoLogger.m6043w("gecko-debug-tag", "DownloadFullSingleFile-release:", e);
                        return objMo5836a;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                try {
                    interfaceC1913aM5981a.mo5979e();
                } catch (Exception e3) {
                    GeckoLogger.m6043w("gecko-debug-tag", "DownloadFullSingleFile-release:", e3);
                }
                throw th;
            }
        } catch (Throwable th2) {
            interfaceC1913aM5981a.mo5979e();
            throw new C1911a("download full single file failed! url:" + string + ", channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getFullPackage().getId() + ", caused by:" + th2.getMessage(), th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m5997a(UpdatePackage updatePackage, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("url empty, channel:" + updatePackage.getChannel());
        }
        int iLastIndexOf = str.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING);
        if (iLastIndexOf == -1) {
            throw new RuntimeException("url path illegal, url:".concat(String.valueOf(str)));
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (TextUtils.isEmpty(strSubstring)) {
            throw new RuntimeException("url path illegal, url:".concat(String.valueOf(str)));
        }
        return strSubstring;
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    protected final void mo5848a(Object... objArr) {
        super.mo5848a(objArr);
        this.f4383d = (C1910b) objArr[0];
        this.f4384e = (File) objArr[1];
    }
}
