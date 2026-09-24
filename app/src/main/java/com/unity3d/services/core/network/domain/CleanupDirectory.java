package com.unity3d.services.core.network.domain;

import com.unity3d.ads.core.log.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p300io.FilesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: CleanupDirectory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m43475d2 = {"Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "", "logger", "Lcom/unity3d/ads/core/log/Logger;", "(Lcom/unity3d/ads/core/log/Logger;)V", "invoke", "", "directory", "Ljava/io/File;", "sizeLimitMb", "", "ageLimitMs", "", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class CleanupDirectory {
    private final Logger logger;

    public CleanupDirectory(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
    }

    public final void invoke(File directory, int sizeLimitMb, long ageLimitMs) {
        List list;
        Intrinsics.checkNotNullParameter(directory, "directory");
        if (!directory.exists() || !directory.isDirectory()) {
            this.logger.debug("Directory does not exist or is not a directory: " + directory + ", nothing to clean up.");
            return;
        }
        Object obj = null;
        Sequence sequenceFilter = SequencesKt.filter(FilesKt.walk$default(directory, null, 1, null), CleanupDirectory$invoke$cachedFiles$1.INSTANCE);
        Iterator it = sequenceFilter.iterator();
        long length = 0;
        long length2 = 0;
        while (it.hasNext()) {
            length2 += ((File) it.next()).length();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : sequenceFilter) {
            if (((File) obj2).lastModified() + ageLimitMs < jCurrentTimeMillis) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.component1();
        List list3 = (List) pair.component2();
        List list4 = list2;
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            length += ((File) it2.next()).length();
        }
        long j = length2 - length;
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            ((File) it3.next()).delete();
        }
        long j2 = sizeLimitMb * 1048576;
        if (j > j2) {
            for (Object obj3 : SequencesKt.runningFold(SequencesKt.sortedWith(CollectionsKt.asSequence(list3), new Comparator() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((File) t).lastModified()), Long.valueOf(((File) t2).lastModified()));
                }
            }), TuplesKt.m43482to(Long.valueOf(j), CollectionsKt.emptyList()), new Function2<Pair<? extends Long, ? extends List<? extends File>>, File, Pair<? extends Long, ? extends List<? extends File>>>() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$additionalFiles$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Pair<? extends Long, ? extends List<? extends File>> invoke(Pair<? extends Long, ? extends List<? extends File>> pair2, File file) {
                    return invoke2((Pair<Long, ? extends List<? extends File>>) pair2, file);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Pair<Long, List<File>> invoke2(Pair<Long, ? extends List<? extends File>> pair2, File file) {
                    Intrinsics.checkNotNullParameter(pair2, "<name for destructuring parameter 0>");
                    Intrinsics.checkNotNullParameter(file, "file");
                    return TuplesKt.m43482to(Long.valueOf(pair2.component1().longValue() - file.length()), CollectionsKt.plus((Collection<? extends File>) pair2.component2(), file));
                }
            })) {
                if (((Number) ((Pair) obj3).component1()).longValue() <= j2) {
                    obj = obj3;
                    break;
                }
            }
            Pair pair2 = (Pair) obj;
            if (pair2 != null && (list = (List) pair2.component2()) != null) {
                list3 = list;
            }
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                ((File) it4.next()).delete();
            }
        }
    }
}
