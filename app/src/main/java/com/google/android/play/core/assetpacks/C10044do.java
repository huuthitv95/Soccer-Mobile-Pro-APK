package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.internal.C10091ak;
import com.google.android.play.core.assetpacks.internal.C10097aq;
import com.google.android.play.core.assetpacks.internal.C10116o;
import com.google.android.play.core.assetpacks.model.C10133b;
import com.google.android.play.core.common.LocalTestingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.do */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10044do implements InterfaceC10145y {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22277a = new C10116o("FakeAssetPackService");

    /* JADX INFO: renamed from: b */
    private static final AtomicInteger f22278b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    private final String f22279c;

    /* JADX INFO: renamed from: d */
    private final C9977bb f22280d;

    /* JADX INFO: renamed from: e */
    private final C10017co f22281e;

    /* JADX INFO: renamed from: f */
    private final Context f22282f;

    /* JADX INFO: renamed from: g */
    private final C10059ec f22283g;

    /* JADX INFO: renamed from: h */
    private final C10057ea f22284h;

    /* JADX INFO: renamed from: i */
    private final Handler f22285i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j */
    private final C10097aq f22286j;

    C10044do(File file, C9977bb c9977bb, C10017co c10017co, Context context, C10059ec c10059ec, C10097aq c10097aq, C10057ea c10057ea) {
        this.f22279c = file.getAbsolutePath();
        this.f22280d = c9977bb;
        this.f22281e = c10017co;
        this.f22282f = context;
        this.f22283g = c10059ec;
        this.f22286j = c10097aq;
        this.f22284h = c10057ea;
    }

    /* JADX INFO: renamed from: k */
    static long m22653k(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: p */
    private final Bundle m22654p(int i, String str, int i2) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f22283g.m22675a());
        bundle.putInt(SDKAnalyticsEvents.PARAMETER_SESSION_ID, i);
        File[] fileArrM22657s = m22657s(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long length = 0;
        for (File file : fileArrM22657s) {
            length += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String strM22712a = C10091ak.m22712a(file);
            bundle.putParcelableArrayList(C10133b.m22791b("chunk_intents", str, strM22712a), arrayList2);
            bundle.putString(C10133b.m22791b("uncompressed_hash_sha256", str, strM22712a), m22656r(file));
            bundle.putLong(C10133b.m22791b("uncompressed_size", str, strM22712a), file.length());
            arrayList.add(strM22712a);
        }
        bundle.putStringArrayList(C10133b.m22790a("slice_ids", str), arrayList);
        bundle.putLong(C10133b.m22790a("pack_version", str), this.f22283g.m22675a());
        bundle.putInt(C10133b.m22790a("status", str), i2);
        bundle.putInt(C10133b.m22790a("error_code", str), 0);
        bundle.putLong(C10133b.m22790a("bytes_downloaded", str), m22653k(i2, length));
        bundle.putLong(C10133b.m22790a("total_bytes_to_download", str), length);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", m22653k(i2, length));
        bundle.putLong("total_bytes_to_download", length);
        final Intent intentPutExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f22285i.post(new Runnable() { // from class: com.google.android.play.core.assetpacks.dn
            @Override // java.lang.Runnable
            public final void run() {
                this.f22275a.m22658l(intentPutExtra);
            }
        });
        return bundle;
    }

    /* JADX INFO: renamed from: q */
    private final AssetPackState m22655q(String str, int i) throws LocalTestingException {
        long length = 0;
        for (File file : m22657s(str)) {
            length += file.length();
        }
        return AssetPackState.m22476a(str, i, 0, m22653k(i, length), length, this.f22281e.m22623a(str), 1, String.valueOf(this.f22283g.m22675a()), this.f22284h.m22673a(str));
    }

    /* JADX INFO: renamed from: r */
    private static String m22656r(File file) throws LocalTestingException {
        try {
            return C10046dq.m22662a(Arrays.asList(file));
        } catch (IOException e) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", file), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e2);
        }
    }

    /* JADX INFO: renamed from: s */
    private final File[] m22657s(final String str) throws LocalTestingException {
        File file = new File(this.f22279c);
        if (!file.isDirectory()) {
            throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.google.android.play.core.assetpacks.dj
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (fileArrListFiles == null) {
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        if (fileArrListFiles.length == 0) {
            throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
        }
        for (File file2 : fileArrListFiles) {
            if (C10091ak.m22712a(file2).equals(str)) {
                return fileArrListFiles;
            }
        }
        throw new LocalTestingException(String.format("No main slice available for pack '%s'.", str));
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: a */
    public final Task mo22516a(int i, String str, String str2, int i2) {
        f22277a.m22752d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            for (File file : m22657s(str)) {
                if (C10091ak.m22712a(file).equals(str2)) {
                    taskCompletionSource.setResult(ParcelFileDescriptor.open(file, 268435456));
                    return taskCompletionSource.getTask();
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
        } catch (LocalTestingException e) {
            f22277a.m22753e("getChunkFileDescriptor failed", e);
            taskCompletionSource.setException(e);
        } catch (FileNotFoundException e2) {
            f22277a.m22753e("getChunkFileDescriptor failed", e2);
            taskCompletionSource.setException(new LocalTestingException("Asset Slice file not found.", e2));
        }
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: b */
    public final Task mo22517b(final List list, final InterfaceC9980be interfaceC9980be, Map map) {
        f22277a.m22752d("getPackStates(%s)", list);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Executor) this.f22286j.mo22526a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.dm
            @Override // java.lang.Runnable
            public final void run() {
                this.f22271a.m22659m(list, interfaceC9980be, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: c */
    public final Task mo22518c(final List list, Map map) {
        f22277a.m22752d("startDownload(%s)", list);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Executor) this.f22286j.mo22526a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.dl
            @Override // java.lang.Runnable
            public final void run() {
                this.f22268a.m22661o(list, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: d */
    public final Task mo22519d(Map map) {
        f22277a.m22752d("syncPacks()", new Object[0]);
        return Tasks.forResult(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: e */
    public final void mo22520e(List list) {
        f22277a.m22752d("cancelDownload(%s)", list);
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: f */
    public final void mo22521f() {
        f22277a.m22752d("keepAlive", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: g */
    public final void mo22522g(int i, String str, String str2, int i2) {
        f22277a.m22752d("notifyChunkTransferred", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: h */
    public final void mo22523h(final int i, final String str) {
        f22277a.m22752d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f22286j.mo22526a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.dk
            @Override // java.lang.Runnable
            public final void run() {
                this.f22265a.m22660n(i, str);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: i */
    public final void mo22524i(int i) {
        f22277a.m22752d("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC10145y
    /* JADX INFO: renamed from: j */
    public final void mo22525j(String str) {
        f22277a.m22752d("removePack(%s)", str);
    }

    /* JADX INFO: renamed from: l */
    final /* synthetic */ void m22658l(Intent intent) {
        this.f22280d.mo22533c(this.f22282f, intent);
    }

    /* JADX INFO: renamed from: m */
    final /* synthetic */ void m22659m(List list, InterfaceC9980be interfaceC9980be, TaskCompletionSource taskCompletionSource) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AssetPackState assetPackStateM22655q = m22655q(str, ((C10076f) interfaceC9980be).f22383a.m22784a(8, str));
                j += assetPackStateM22655q.totalBytesToDownload();
                map.put(str, assetPackStateM22655q);
            } catch (LocalTestingException e) {
                taskCompletionSource.setException(e);
                return;
            }
        }
        taskCompletionSource.setResult(new C9990bo(j, map));
    }

    /* JADX INFO: renamed from: n */
    final /* synthetic */ void m22660n(int i, String str) {
        try {
            m22654p(i, str, 4);
        } catch (LocalTestingException e) {
            f22277a.m22753e("notifyModuleCompleted failed", e);
        }
    }

    /* JADX INFO: renamed from: o */
    final /* synthetic */ void m22661o(List list, TaskCompletionSource taskCompletionSource) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AssetPackState assetPackStateM22655q = m22655q(str, 1);
                j += assetPackStateM22655q.totalBytesToDownload();
                map.put(str, assetPackStateM22655q);
            } catch (LocalTestingException e) {
                taskCompletionSource.setException(e);
                return;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            try {
                int andIncrement = f22278b.getAndIncrement();
                m22654p(andIncrement, str2, 1);
                m22654p(andIncrement, str2, 2);
                m22654p(andIncrement, str2, 3);
            } catch (LocalTestingException e2) {
                taskCompletionSource.setException(e2);
                return;
            }
        }
        taskCompletionSource.setResult(new C9990bo(j, map));
    }
}
