package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.U5 */
/* JADX INFO: loaded from: classes6.dex */
public class C11695U5 {

    /* JADX INFO: renamed from: a */
    private final Context f25878a;

    /* JADX INFO: renamed from: b */
    private final C12145d5 f25879b;

    /* JADX INFO: renamed from: c */
    private final HandlerC11678T5 f25880c;

    /* JADX INFO: renamed from: d */
    private final C11509Jb f25881d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC12582w7 f25882e = C11455Gb.m25891U().mo25842a();

    public C11695U5(Context context, C12145d5 c12145d5, HandlerC11678T5 handlerC11678T5, C11509Jb c11509Jb) {
        this.f25878a = context;
        this.f25879b = c12145d5;
        this.f25880c = handlerC11678T5;
        this.f25881d = c11509Jb;
    }

    /* JADX INFO: renamed from: a */
    public void m27590a(C12601x8 c12601x8, String str, int i, int i2, InterfaceC11510Jc interfaceC11510Jc) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(C11661S5.a.f25638a);
        }
        if (this.f25882e.mo27884a(this.f25879b.m31288a()) <= 0) {
            throw new Exception(C11778Z3.f26656A);
        }
        if (!C11676T3.m27507h(this.f25878a)) {
            throw new Exception(C11778Z3.f26658C);
        }
        this.f25880c.m27518a(c12601x8.getPath(), new a(interfaceC11510Jc));
        if (!c12601x8.exists()) {
            this.f25879b.mo31292a(c12601x8, str, i, i2, this.f25880c);
            return;
        }
        Message message = new Message();
        message.obj = c12601x8;
        message.what = 1015;
        this.f25880c.sendMessage(message);
    }

    /* JADX INFO: renamed from: b */
    public void m27592b(C12601x8 c12601x8) throws Exception {
        if (c12601x8.exists()) {
            ArrayList<C12601x8> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(c12601x8);
            if (!IronSourceStorageUtils.deleteFolderContentRecursive(c12601x8) || !c12601x8.delete()) {
                throw new Exception("Failed to delete folder");
            }
            this.f25881d.m26213a(filesInFolderRecursive);
        }
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m27593c(C12601x8 c12601x8) throws Exception {
        if (c12601x8.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(c12601x8, this.f25881d.m26214b());
        }
        throw new Exception("Folder does not exist");
    }

    /* JADX INFO: renamed from: d */
    public long m27594d(C12601x8 c12601x8) throws Exception {
        if (c12601x8.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(c12601x8);
        }
        throw new Exception("Folder does not exist");
    }

    /* JADX INFO: renamed from: com.ironsource.U5$a */
    class a implements InterfaceC11510Jc {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC11510Jc f25883a;

        /* JADX INFO: renamed from: com.ironsource.U5$a$a, reason: collision with other inner class name */
        class C15517a extends JSONObject {
            C15517a() throws JSONException {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        a(InterfaceC11510Jc interfaceC11510Jc) {
            this.f25883a = interfaceC11510Jc;
        }

        @Override // com.ironsource.InterfaceC11510Jc
        /* JADX INFO: renamed from: a */
        public void mo26216a(C12601x8 c12601x8) {
            this.f25883a.mo26216a(c12601x8);
            try {
                C11695U5.this.f25881d.m26212a(c12601x8.getName(), new C15517a());
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.InterfaceC11510Jc
        /* JADX INFO: renamed from: a */
        public void mo26217a(C12601x8 c12601x8, C12404o8 c12404o8) {
            this.f25883a.mo26217a(c12601x8, c12404o8);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m27589a(C12601x8 c12601x8) throws Exception {
        if (c12601x8.exists()) {
            if (c12601x8.delete()) {
                this.f25881d.m26211a(c12601x8.getName());
                return;
            }
            throw new Exception("Failed to delete file");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m27591a(C12601x8 c12601x8, JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            if (c12601x8.exists()) {
                if (!this.f25881d.m26215b(c12601x8.getName(), jSONObject)) {
                    throw new Exception("Failed to update attribute");
                }
                return;
            }
            throw new Exception("File does not exist");
        }
        throw new Exception("Missing attributes to update");
    }
}
