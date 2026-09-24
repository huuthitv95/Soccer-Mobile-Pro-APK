package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadCursor;
import com.google.android.exoplayer2.offline.DownloadManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.aj */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3647aj {
    /* JADX INFO: renamed from: a */
    public static final C4087u6 m16843a(DownloadManager downloadManager, String id) throws IOException {
        Intrinsics.checkNotNullParameter(downloadManager, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        Download download = downloadManager.getDownloadIndex().getDownload(id);
        if (download != null) {
            return AbstractC4109v6.m19651a(download);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final List m16844a(DownloadCursor downloadCursor) {
        Intrinsics.checkNotNullParameter(downloadCursor, "<this>");
        ArrayList arrayList = new ArrayList();
        while (downloadCursor.moveToNext()) {
            Download download = downloadCursor.getDownload();
            Intrinsics.checkNotNullExpressionValue(download, "getDownload(...)");
            arrayList.add(AbstractC4109v6.m19651a(download));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final List m16845a(DownloadManager downloadManager) throws IOException {
        Intrinsics.checkNotNullParameter(downloadManager, "<this>");
        DownloadCursor downloads = downloadManager.getDownloadIndex().getDownloads(new int[0]);
        Intrinsics.checkNotNullExpressionValue(downloads, "getDownloads(...)");
        return m16844a(downloads);
    }
}
