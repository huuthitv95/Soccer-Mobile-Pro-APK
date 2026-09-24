package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackManagerFactory;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import com.google.android.play.core.assetpacks.AssetPackStates;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.RuntimeExecutionException;
import com.google.android.play.core.tasks.Task;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.unity3d.player.a */
/* JADX INFO: loaded from: classes7.dex */
final class C14680a implements InterfaceC14683d {

    /* JADX INFO: renamed from: a */
    private static C14680a f41639a;

    /* JADX INFO: renamed from: b */
    private AssetPackManager f41640b;

    /* JADX INFO: renamed from: c */
    private HashSet f41641c;

    /* JADX INFO: renamed from: d */
    private Object f41642d;

    /* JADX INFO: renamed from: com.unity3d.player.a$a */
    private static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private Set f41643a;

        /* JADX INFO: renamed from: b */
        private String f41644b;

        /* JADX INFO: renamed from: c */
        private int f41645c;

        /* JADX INFO: renamed from: d */
        private long f41646d;

        /* JADX INFO: renamed from: e */
        private long f41647e;

        /* JADX INFO: renamed from: f */
        private int f41648f;

        /* JADX INFO: renamed from: g */
        private int f41649g;

        a(Set set, String str, int i, long j, long j2, int i2, int i3) {
            this.f41643a = set;
            this.f41644b = str;
            this.f41645c = i;
            this.f41646d = j;
            this.f41647e = j2;
            this.f41648f = i2;
            this.f41649g = i3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.f41643a.iterator();
            while (it.hasNext()) {
                ((IAssetPackManagerDownloadStatusCallback) it.next()).onStatusUpdate(this.f41644b, this.f41645c, this.f41646d, this.f41647e, this.f41648f, this.f41649g);
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.player.a$b */
    private class b implements AssetPackStateUpdateListener {

        /* JADX INFO: renamed from: b */
        private HashSet f41651b;

        /* JADX INFO: renamed from: c */
        private Looper f41652c;

        public b(C14680a c14680a, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
            this(iAssetPackManagerDownloadStatusCallback, Looper.myLooper());
        }

        public b(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, Looper looper) {
            HashSet hashSet = new HashSet();
            this.f41651b = hashSet;
            hashSet.add(iAssetPackManagerDownloadStatusCallback);
            this.f41652c = looper;
        }

        /* JADX INFO: renamed from: a */
        private static Set m43261a(HashSet hashSet) {
            return (Set) hashSet.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.play.core.listener.StateUpdatedListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public synchronized void onStateUpdate(AssetPackState assetPackState) {
            if (assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                synchronized (C14680a.f41639a) {
                    C14680a.this.f41641c.remove(assetPackState.name());
                    if (C14680a.this.f41641c.isEmpty()) {
                        C14680a c14680a = C14680a.this;
                        c14680a.mo43256a(c14680a.f41642d);
                        C14680a.m43252c(C14680a.this);
                    }
                }
            }
            if (this.f41651b.size() == 0) {
                return;
            }
            new Handler(this.f41652c).post(new a(m43261a(this.f41651b), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m43263a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
            this.f41651b.add(iAssetPackManagerDownloadStatusCallback);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.player.a$c */
    private static class c implements OnSuccessListener {

        /* JADX INFO: renamed from: a */
        private IAssetPackManagerMobileDataConfirmationCallback f41653a;

        /* JADX INFO: renamed from: b */
        private Looper f41654b = Looper.myLooper();

        /* JADX INFO: renamed from: com.unity3d.player.a$c$a */
        private static class a implements Runnable {

            /* JADX INFO: renamed from: a */
            private IAssetPackManagerMobileDataConfirmationCallback f41655a;

            /* JADX INFO: renamed from: b */
            private boolean f41656b;

            a(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z) {
                this.f41655a = iAssetPackManagerMobileDataConfirmationCallback;
                this.f41656b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f41655a.onMobileDataConfirmationResult(this.f41656b);
            }
        }

        public c(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
            this.f41653a = iAssetPackManagerMobileDataConfirmationCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Integer num) {
            if (this.f41653a != null) {
                new Handler(this.f41654b).post(new a(this.f41653a, num.intValue() == -1));
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.player.a$d */
    private static class d implements OnCompleteListener {

        /* JADX INFO: renamed from: a */
        private IAssetPackManagerDownloadStatusCallback f41657a;

        /* JADX INFO: renamed from: b */
        private Looper f41658b = Looper.myLooper();

        /* JADX INFO: renamed from: c */
        private String f41659c;

        public d(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, String str) {
            this.f41657a = iAssetPackManagerDownloadStatusCallback;
            this.f41659c = str;
        }

        /* JADX INFO: renamed from: a */
        private void m43265a(String str, int i, int i2, long j) {
            new Handler(this.f41658b).post(new a(Collections.singleton(this.f41657a), str, i, j, i == 4 ? j : 0L, 0, i2));
        }

        public final void onComplete(Task task) {
            try {
                AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
                Map<String, AssetPackState> mapPackStates = assetPackStates.packStates();
                if (mapPackStates.size() == 0) {
                    return;
                }
                for (AssetPackState assetPackState : mapPackStates.values()) {
                    if (assetPackState.errorCode() != 0 || assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                        m43265a(assetPackState.name(), assetPackState.status(), assetPackState.errorCode(), assetPackStates.totalBytes());
                    } else {
                        C14680a.f41639a.m43250a(assetPackState.name(), this.f41657a, this.f41658b);
                    }
                }
            } catch (RuntimeExecutionException e) {
                m43265a(this.f41659c, 0, e.getErrorCode(), 0L);
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.player.a$e */
    private static class e implements OnCompleteListener {

        /* JADX INFO: renamed from: a */
        private IAssetPackManagerStatusQueryCallback f41660a;

        /* JADX INFO: renamed from: b */
        private Looper f41661b = Looper.myLooper();

        /* JADX INFO: renamed from: c */
        private String[] f41662c;

        /* JADX INFO: renamed from: com.unity3d.player.a$e$a */
        private static class a implements Runnable {

            /* JADX INFO: renamed from: a */
            private IAssetPackManagerStatusQueryCallback f41663a;

            /* JADX INFO: renamed from: b */
            private long f41664b;

            /* JADX INFO: renamed from: c */
            private String[] f41665c;

            /* JADX INFO: renamed from: d */
            private int[] f41666d;

            /* JADX INFO: renamed from: e */
            private int[] f41667e;

            a(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, long j, String[] strArr, int[] iArr, int[] iArr2) {
                this.f41663a = iAssetPackManagerStatusQueryCallback;
                this.f41664b = j;
                this.f41665c = strArr;
                this.f41666d = iArr;
                this.f41667e = iArr2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f41663a.onStatusResult(this.f41664b, this.f41665c, this.f41666d, this.f41667e);
            }
        }

        public e(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, String[] strArr) {
            this.f41660a = iAssetPackManagerStatusQueryCallback;
            this.f41662c = strArr;
        }

        public final void onComplete(Task task) {
            if (this.f41660a == null) {
                return;
            }
            int i = 0;
            try {
                AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
                Map<String, AssetPackState> mapPackStates = assetPackStates.packStates();
                int size = mapPackStates.size();
                String[] strArr = new String[size];
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                for (AssetPackState assetPackState : mapPackStates.values()) {
                    strArr[i] = assetPackState.name();
                    iArr[i] = assetPackState.status();
                    iArr2[i] = assetPackState.errorCode();
                    i++;
                }
                new Handler(this.f41661b).post(new a(this.f41660a, assetPackStates.totalBytes(), strArr, iArr, iArr2));
            } catch (RuntimeExecutionException e) {
                String message = e.getMessage();
                for (String str : this.f41662c) {
                    if (message.contains(str)) {
                        new Handler(this.f41661b).post(new a(this.f41660a, 0L, new String[]{str}, new int[]{0}, new int[]{e.getErrorCode()}));
                        return;
                    }
                }
                String[] strArr2 = this.f41662c;
                int[] iArr3 = new int[strArr2.length];
                int[] iArr4 = new int[strArr2.length];
                for (int i2 = 0; i2 < this.f41662c.length; i2++) {
                    iArr3[i2] = 0;
                    iArr4[i2] = e.getErrorCode();
                }
                new Handler(this.f41661b).post(new a(this.f41660a, 0L, this.f41662c, iArr3, iArr4));
            }
        }
    }

    private C14680a(Context context) {
        if (f41639a != null) {
            throw new RuntimeException("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
        }
        this.f41640b = AssetPackManagerFactory.getInstance(context);
        this.f41641c = new HashSet();
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC14683d m43247a(Context context) {
        if (f41639a == null) {
            f41639a = new C14680a(context);
        }
        return f41639a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m43250a(String str, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, Looper looper) {
        synchronized (f41639a) {
            Object obj = this.f41642d;
            if (obj == null) {
                b bVar = new b(iAssetPackManagerDownloadStatusCallback, looper);
                this.f41640b.registerListener(bVar);
                this.f41642d = bVar;
            } else {
                ((b) obj).m43263a(iAssetPackManagerDownloadStatusCallback);
            }
            this.f41641c.add(str);
            this.f41640b.fetch(Collections.singletonList(str));
        }
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ Object m43252c(C14680a c14680a) {
        c14680a.f41642d = null;
        return null;
    }

    @Override // com.unity3d.player.InterfaceC14683d
    /* JADX INFO: renamed from: a */
    public final Object mo43253a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        b bVar = new b(this, iAssetPackManagerDownloadStatusCallback);
        this.f41640b.registerListener(bVar);
        return bVar;
    }

    @Override // com.unity3d.player.InterfaceC14683d
    /* JADX INFO: renamed from: a */
    public final String mo43254a(String str) {
        AssetPackLocation packLocation = this.f41640b.getPackLocation(str);
        return packLocation == null ? "" : packLocation.assetsPath();
    }

    @Override // com.unity3d.player.InterfaceC14683d
    /* JADX INFO: renamed from: a */
    public final void mo43255a(Activity activity, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.f41640b.showCellularDataConfirmation(activity).addOnSuccessListener(new c(iAssetPackManagerMobileDataConfirmationCallback));
    }

    @Override // com.unity3d.player.InterfaceC14683d
    /* JADX INFO: renamed from: a */
    public final void mo43256a(Object obj) {
        if (obj instanceof b) {
            this.f41640b.unregisterListener((b) obj);
        }
    }

    @Override // com.unity3d.player.InterfaceC14683d
    /* JADX INFO: renamed from: a */
    public final void mo43257a(String[] strArr) {
        this.f41640b.cancel(Arrays.asList(strArr));
    }

    @Override // com.unity3d.player.InterfaceC14683d
    /* JADX INFO: renamed from: a */
    public final void mo43258a(String[] strArr, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        for (String str : strArr) {
            this.f41640b.getPackStates(Collections.singletonList(str)).addOnCompleteListener(new d(iAssetPackManagerDownloadStatusCallback, str));
        }
    }

    @Override // com.unity3d.player.InterfaceC14683d
    /* JADX INFO: renamed from: a */
    public final void mo43259a(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        this.f41640b.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new e(iAssetPackManagerStatusQueryCallback, strArr));
    }

    @Override // com.unity3d.player.InterfaceC14683d
    /* JADX INFO: renamed from: b */
    public final void mo43260b(String str) {
        this.f41640b.removePack(str);
    }
}
