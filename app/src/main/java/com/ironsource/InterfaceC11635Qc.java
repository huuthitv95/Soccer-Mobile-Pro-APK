package com.ironsource;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Qc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11635Qc {

    /* JADX INFO: renamed from: com.ironsource.Qc$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(InterfaceC11635Qc _this, AbstractC11353B instance, String str, C12266ja publisherDataHolder) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        }

        public static void $default$a(InterfaceC11635Qc _this, List waterfallInstances, AbstractC11353B winnerInstance) {
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            Intrinsics.checkNotNullParameter(winnerInstance, "winnerInstance");
        }
    }

    /* JADX INFO: renamed from: a */
    void mo27302a(AbstractC11353B abstractC11353B, String str, C12266ja c12266ja);

    /* JADX INFO: renamed from: a */
    void mo27303a(List<? extends AbstractC11353B> list, AbstractC11353B abstractC11353B);
}
