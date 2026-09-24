package com.google.android.play.core.assetpacks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.internal.C10084ad;
import com.google.android.play.core.assetpacks.internal.C10097aq;
import com.google.android.play.core.assetpacks.internal.C10116o;
import com.google.android.play.core.assetpacks.model.C10133b;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.l */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10130l implements AssetPackManager {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22444a = new C10116o("AssetPackManager");

    /* JADX INFO: renamed from: b */
    private final C9983bh f22445b;

    /* JADX INFO: renamed from: c */
    private final C9977bb f22446c;

    /* JADX INFO: renamed from: d */
    private final C10084ad f22447d;

    /* JADX INFO: renamed from: e */
    private final C10034de f22448e;

    /* JADX INFO: renamed from: f */
    private final C10017co f22449f;

    /* JADX INFO: renamed from: g */
    private final C9999bx f22450g;

    /* JADX INFO: renamed from: h */
    private final C10057ea f22451h;

    /* JADX INFO: renamed from: i */
    private final Handler f22452i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j */
    private boolean f22453j;

    /* JADX INFO: renamed from: k */
    private final C10097aq f22454k;

    /* JADX INFO: renamed from: l */
    private final C10097aq f22455l;

    C10130l(C9983bh c9983bh, C10097aq c10097aq, C9977bb c9977bb, C10084ad c10084ad, C10034de c10034de, C10017co c10017co, C9999bx c9999bx, C10097aq c10097aq2, C10057ea c10057ea) {
        this.f22445b = c9983bh;
        this.f22454k = c10097aq;
        this.f22446c = c9977bb;
        this.f22447d = c10084ad;
        this.f22448e = c10034de;
        this.f22449f = c10017co;
        this.f22450g = c9999bx;
        this.f22455l = c10097aq2;
        this.f22451h = c10057ea;
    }

    /* JADX INFO: renamed from: h */
    private final Task m22782h(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", this.f22450g.m22609a());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new ResultReceiverC10129k(this, this.f22452i, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: i */
    private final void m22783i() {
        ((Executor) this.f22455l.mo22526a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f22328a.m22787f();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    final int m22784a(int i, String str) {
        if (!this.f22445b.m22556G(str) && i == 4) {
            return 8;
        }
        if (!this.f22445b.m22556G(str) || i == 4) {
            return i;
        }
        return 4;
    }

    /* JADX INFO: renamed from: c */
    final /* synthetic */ void m22785c() {
        this.f22445b.m22581y();
        this.f22445b.m22579w();
        this.f22445b.m22580x();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final AssetPackStates cancel(List<String> list) {
        Map mapM22639f = this.f22448e.m22639f(list);
        HashMap map = new HashMap();
        for (String str : list) {
            Integer num = (Integer) mapM22639f.get(str);
            map.put(str, AssetPackState.m22476a(str, num == null ? 0 : num.intValue(), 0, 0L, 0L, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 0, "", ""));
        }
        ((InterfaceC10145y) this.f22454k.mo22526a()).mo22520e(list);
        return new C9990bo(0L, map);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final void clearListeners() {
        this.f22446c.m22742e();
    }

    /* JADX INFO: renamed from: d */
    final /* synthetic */ void m22786d(String str, TaskCompletionSource taskCompletionSource) {
        if (!this.f22445b.m22553D(str)) {
            taskCompletionSource.setException(new IOException(String.format("Failed to remove pack %s.", str)));
        } else {
            taskCompletionSource.setResult(null);
            ((InterfaceC10145y) this.f22454k.mo22526a()).mo22525j(str);
        }
    }

    /* JADX INFO: renamed from: f */
    final /* synthetic */ void m22787f() {
        Task taskMo22519d = ((InterfaceC10145y) this.f22454k.mo22526a()).mo22519d(this.f22445b.m22577u());
        Executor executor = (Executor) this.f22455l.mo22526a();
        final C9983bh c9983bh = this.f22445b;
        Objects.requireNonNull(c9983bh);
        taskMo22519d.addOnSuccessListener(executor, new OnSuccessListener() { // from class: com.google.android.play.core.assetpacks.i
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                c9983bh.m22552C((List) obj);
            }
        }).addOnFailureListener((Executor) this.f22455l.mo22526a(), new OnFailureListener() { // from class: com.google.android.play.core.assetpacks.j
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C10130l.f22444a.m22753e(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task<AssetPackStates> fetch(List<String> list) {
        Map mapM22577u = this.f22445b.m22577u();
        ArrayList arrayList = new ArrayList(list);
        if (!arrayList.isEmpty()) {
            return ((InterfaceC10145y) this.f22454k.mo22526a()).mo22518c(arrayList, mapM22577u);
        }
        Bundle bundle = new Bundle();
        bundle.putInt(SDKAnalyticsEvents.PARAMETER_SESSION_ID, 0);
        bundle.putInt("error_code", 0);
        for (String str : list) {
            bundle.putInt(C10133b.m22790a("status", str), 4);
            bundle.putInt(C10133b.m22790a("error_code", str), 0);
            bundle.putLong(C10133b.m22790a("total_bytes_to_download", str), 0L);
            bundle.putLong(C10133b.m22790a("bytes_downloaded", str), 0L);
        }
        bundle.putStringArrayList("pack_names", new ArrayList<>(list));
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        return Tasks.forResult(AssetPackStates.m22478a(bundle, this.f22449f, this.f22451h, C9981bf.f22064a));
    }

    /* JADX INFO: renamed from: g */
    final void m22788g(boolean z) {
        C9977bb c9977bb = this.f22446c;
        boolean zM22747j = c9977bb.m22747j();
        c9977bb.m22744g(z);
        if (!z || zM22747j) {
            return;
        }
        m22783i();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final AssetLocation getAssetLocation(String str, String str2) {
        AssetPackLocation assetPackLocationM22562f;
        if (!this.f22453j) {
            ((Executor) this.f22455l.mo22526a()).execute(new RunnableC10078h(this));
            this.f22453j = true;
        }
        if (this.f22445b.m22556G(str)) {
            try {
                assetPackLocationM22562f = this.f22445b.m22562f(str);
            } catch (IOException unused) {
            }
        } else {
            assetPackLocationM22562f = this.f22447d.m22704a().contains(str) ? AssetPackLocation.m22475a() : null;
        }
        if (assetPackLocationM22562f == null) {
            return null;
        }
        if (assetPackLocationM22562f.packStorageMethod() == 1) {
            C9983bh c9983bh = this.f22445b;
            return c9983bh.m22560d(str, str2, c9983bh.m22575s(str));
        }
        if (assetPackLocationM22562f.packStorageMethod() == 0) {
            return this.f22445b.m22561e(str, str2, assetPackLocationM22562f);
        }
        f22444a.m22749a("The asset %s is not present in Asset Pack %s", str2, str);
        return null;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final AssetPackLocation getPackLocation(String str) {
        if (!this.f22453j) {
            ((Executor) this.f22455l.mo22526a()).execute(new RunnableC10078h(this));
            this.f22453j = true;
        }
        if (this.f22445b.m22556G(str)) {
            try {
                return this.f22445b.m22562f(str);
            } catch (IOException unused) {
                return null;
            }
        }
        if (this.f22447d.m22704a().contains(str)) {
            return AssetPackLocation.m22475a();
        }
        return null;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Map<String, AssetPackLocation> getPackLocations() {
        Map<String, AssetPackLocation> mapM22578v = this.f22445b.m22578v();
        HashMap map = new HashMap();
        Iterator it = this.f22447d.m22704a().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), AssetPackLocation.m22475a());
        }
        mapM22578v.putAll(map);
        return mapM22578v;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task<AssetPackStates> getPackStates(List<String> list) {
        return ((InterfaceC10145y) this.f22454k.mo22526a()).mo22517b(list, new C10076f(this), this.f22445b.m22577u());
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final synchronized void registerListener(AssetPackStateUpdateListener assetPackStateUpdateListener) {
        C9977bb c9977bb = this.f22446c;
        boolean zM22747j = c9977bb.m22747j();
        c9977bb.m22743f(assetPackStateUpdateListener);
        if (zM22747j) {
            return;
        }
        m22783i();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task<Void> removePack(final String str) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Executor) this.f22455l.mo22526a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f22384a.m22786d(str, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task<Integer> showCellularDataConfirmation(Activity activity) {
        if (activity == null) {
            return Tasks.forException(new AssetPackException(-3));
        }
        return this.f22450g.m22609a() == null ? Tasks.forException(new AssetPackException(-12)) : m22782h(activity);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final boolean showCellularDataConfirmation(ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
        if (activityResultLauncher == null || this.f22450g.m22609a() == null) {
            return false;
        }
        activityResultLauncher.launch(new IntentSenderRequest.Builder(this.f22450g.m22609a().getIntentSender()).build());
        return true;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task<Integer> showConfirmationDialog(Activity activity) {
        if (activity == null) {
            return Tasks.forException(new AssetPackException(-3));
        }
        return this.f22450g.m22609a() == null ? Tasks.forException(new AssetPackException(-14)) : m22782h(activity);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final boolean showConfirmationDialog(ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
        if (activityResultLauncher == null || this.f22450g.m22609a() == null) {
            return false;
        }
        activityResultLauncher.launch(new IntentSenderRequest.Builder(this.f22450g.m22609a().getIntentSender()).build());
        return true;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final void unregisterListener(AssetPackStateUpdateListener assetPackStateUpdateListener) {
        this.f22446c.m22745h(assetPackStateUpdateListener);
    }
}
