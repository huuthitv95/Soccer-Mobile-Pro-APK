package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.internal.C10087ag;
import com.google.android.play.core.assetpacks.internal.C10089ai;
import com.google.android.play.core.assetpacks.internal.C10116o;
import com.google.android.play.core.assetpacks.internal.C10127z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.aw */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9971aw implements InterfaceC10145y {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22021a = new C10116o("AssetPackServiceImpl");

    /* JADX INFO: renamed from: b */
    private static final Intent f22022b = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: c */
    private final String f22023c;

    /* JADX INFO: renamed from: d */
    private final C10017co f22024d;

    /* JADX INFO: renamed from: e */
    private final C10057ea f22025e;

    /* JADX INFO: renamed from: f */
    private C10127z f22026f;

    /* JADX INFO: renamed from: g */
    private C10127z f22027g;

    /* JADX INFO: renamed from: h */
    private final AtomicBoolean f22028h = new AtomicBoolean();

    C9971aw(Context context, C10017co c10017co, C10057ea c10057ea) {
        this.f22023c = context.getPackageName();
        this.f22024d = c10017co;
        this.f22025e = c10057ea;
        if (C10089ai.m22709b(context)) {
            Context contextM22706a = C10087ag.m22706a(context);
            C10116o c10116o = f22021a;
            Intent intent = f22022b;
            this.f22026f = new C10127z(contextM22706a, c10116o, "AssetPackService", intent, C9949aa.f21967a, null);
            this.f22027g = new C10127z(C10087ag.m22706a(context), c10116o, "AssetPackService-keepAlive", intent, C9949aa.f21967a, null);
        }
        f22021a.m22749a("AssetPackService initiated.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static Bundle m22496A() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 20201);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static Bundle m22497B(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(SDKAnalyticsEvents.PARAMETER_SESSION_ID, i);
        return bundle;
    }

    /* JADX INFO: renamed from: C */
    private static Task m22498C() {
        f22021a.m22750b("onError(%d)", -11);
        return Tasks.forException(new AssetPackException(-11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final void m22499D(int i, String str, int i2) {
        if (this.f22026f == null) {
            throw new C10013ck("The Play Store app is not installed or is an unofficial version.", i);
        }
        f22021a.m22752d("notifyModuleCompleted", new Object[0]);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22026f.m22777s(new C9956ah(this, taskCompletionSource, i, str, taskCompletionSource, i2), taskCompletionSource);
    }

    /* JADX INFO: renamed from: k */
    static /* bridge */ /* synthetic */ Bundle m22500k(int i, String str, String str2, int i2) {
        Bundle bundleM22515z = m22515z(i, str);
        bundleM22515z.putString("slice_id", str2);
        bundleM22515z.putInt("chunk_number", i2);
        return bundleM22515z;
    }

    /* JADX INFO: renamed from: n */
    static /* bridge */ /* synthetic */ Bundle m22503n(Map map) {
        Bundle bundleM22496A = m22496A();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        bundleM22496A.putParcelableArrayList("installed_asset_module", arrayList);
        return bundleM22496A;
    }

    /* JADX INFO: renamed from: v */
    static /* bridge */ /* synthetic */ ArrayList m22511v(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    static /* bridge */ /* synthetic */ List m22512w(C9971aw c9971aw, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = AssetPackStates.m22478a((Bundle) it.next(), c9971aw.f22024d, c9971aw.f22025e, C9981bf.f22064a).packStates().values().iterator().next();
            if (next == null) {
                f22021a.m22750b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (C9982bg.m22536a(next.status())) {
                arrayList.add(next.name());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static Bundle m22515z(int i, String str) {
        Bundle bundleM22497B = m22497B(i);
        bundleM22497B.putString("module_name", str);
        return bundleM22497B;
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: a */
    public final Task mo22516a(int i, String str, String str2, int i2) {
        if (this.f22026f == null) {
            return m22498C();
        }
        f22021a.m22752d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22026f.m22777s(new C9958aj(this, taskCompletionSource, i, str, str2, i2, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: b */
    public final Task mo22517b(List list, InterfaceC9980be interfaceC9980be, Map map) {
        if (this.f22026f == null) {
            return m22498C();
        }
        f22021a.m22752d("getPackStates(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22026f.m22777s(new C9954af(this, taskCompletionSource, list, map, taskCompletionSource, interfaceC9980be), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: c */
    public final Task mo22518c(List list, Map map) {
        if (this.f22026f == null) {
            return m22498C();
        }
        f22021a.m22752d("startDownload(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22026f.m22777s(new C9951ac(this, taskCompletionSource, list, map, taskCompletionSource), taskCompletionSource);
        taskCompletionSource.getTask().addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.assetpacks.z
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f22479a.mo22521f();
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: d */
    public final Task mo22519d(Map map) {
        if (this.f22026f == null) {
            return m22498C();
        }
        f22021a.m22752d("syncPacks", new Object[0]);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22026f.m22777s(new C9953ae(this, taskCompletionSource, map, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: e */
    public final void mo22520e(List list) {
        if (this.f22026f == null) {
            return;
        }
        f22021a.m22752d("cancelDownloads(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22026f.m22777s(new C9952ad(this, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: f */
    public final synchronized void mo22521f() {
        if (this.f22027g == null) {
            f22021a.m22753e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        C10116o c10116o = f22021a;
        c10116o.m22752d("keepAlive", new Object[0]);
        if (!this.f22028h.compareAndSet(false, true)) {
            c10116o.m22752d("Service is already kept alive.", new Object[0]);
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f22027g.m22777s(new C9959ak(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        }
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: g */
    public final void mo22522g(int i, String str, String str2, int i2) {
        if (this.f22026f == null) {
            throw new C10013ck("The Play Store app is not installed or is an unofficial version.", i);
        }
        f22021a.m22752d("notifyChunkTransferred", new Object[0]);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22026f.m22777s(new C9955ag(this, taskCompletionSource, i, str, str2, i2, taskCompletionSource), taskCompletionSource);
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: h */
    public final void mo22523h(int i, String str) {
        m22499D(i, str, 10);
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: i */
    public final void mo22524i(int i) {
        if (this.f22026f == null) {
            throw new C10013ck("The Play Store app is not installed or is an unofficial version.", i);
        }
        f22021a.m22752d("notifySessionFailed", new Object[0]);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22026f.m22777s(new C9957ai(this, taskCompletionSource, i, taskCompletionSource), taskCompletionSource);
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: j */
    public final void mo22525j(String str) {
        if (this.f22026f == null) {
            return;
        }
        f22021a.m22752d("removePack(%s)", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22026f.m22777s(new C9950ab(this, taskCompletionSource, str, taskCompletionSource), taskCompletionSource);
    }
}
