package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.p295di.ServiceProvider;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: UniversalRequestDataStoreProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\u0002R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m43475d2 = {"Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "", "context", "Landroid/content/Context;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)V", "cachedDataStore", "Landroidx/datastore/core/DataStore;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "getContext", "()Landroid/content/Context;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "createDataStore", "invoke", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class UniversalRequestDataStoreProvider {
    private DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> cachedDataStore;
    private final Context context;
    private final CoroutineDispatcher dispatcher;

    public UniversalRequestDataStoreProvider(Context context, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.context = context;
        this.dispatcher = dispatcher;
    }

    private final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> createDataStore() {
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new UniversalRequestStoreSerializer(), new ReplaceFileCorruptionHandler(new Function1<CorruptionException, UniversalRequestStoreOuterClass.UniversalRequestStore>() { // from class: com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider.createDataStore.1
            @Override // kotlin.jvm.functions.Function1
            public final UniversalRequestStoreOuterClass.UniversalRequestStore invoke(CorruptionException it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new UniversalRequestStoreSerializer().getDefaultValue();
            }
        }), null, CoroutineScopeKt.CoroutineScope(this.dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new Function0<File>() { // from class: com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider.createDataStore.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(UniversalRequestDataStoreProvider.this.getContext(), ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
            }
        }, 4, null);
    }

    public final Context getContext() {
        return this.context;
    }

    public final CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> invoke() {
        synchronized (this) {
            DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> dataStore = this.cachedDataStore;
            if (dataStore != null) {
                return dataStore;
            }
            DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> dataStoreCreateDataStore = createDataStore();
            this.cachedDataStore = dataStoreCreateDataStore;
            return dataStoreCreateDataStore;
        }
    }
}
