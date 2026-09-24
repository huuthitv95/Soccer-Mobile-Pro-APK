package com.vungle.ads.internal.util;

import android.os.Build;
import android.webkit.URLUtil;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C11744X3;
import com.vungle.ads.AssetFailedToDeleteError;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p300io.FilesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: FileUtility.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u00017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J$\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0018H\u0007J\"\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aH\u0007J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!H\u0002J\u001a\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004J\u0010\u0010%\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010\u0004J\u0012\u0010'\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0007J&\u0010'\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010 \u001a\u00020!2\n\u0010(\u001a\u00060)j\u0002`*H\u0002J$\u0010+\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\n\u0010(\u001a\u00060)j\u0002`*H\u0002J\u001d\u0010,\u001a\u0004\u0018\u0001H-\"\u0004\b\u0000\u0010-2\u0006\u0010\u001c\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u0018J\u0010\u00100\u001a\u0002012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018J\u001a\u00102\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00182\b\u00103\u001a\u0004\u0018\u000104H\u0007J\u0018\u00105\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00182\b\u00106\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00068"}, m43475d2 = {"Lcom/vungle/ads/internal/util/FileUtility;", "", "()V", "TAG", "", "allowedClasses", "", "Ljava/lang/Class;", "getAllowedClasses$vungle_ads_release$annotations", "getAllowedClasses$vungle_ads_release", "()Ljava/util/List;", "<set-?>", "Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;", "objectInputStreamProvider", "getObjectInputStreamProvider", "()Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;", "setObjectInputStreamProvider", "(Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;)V", "closeQuietly", "", "closeable", "Ljava/io/Closeable;", "delete", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/io/File;", "excludeFiles", "", "deleteAndLogIfFailed", C11744X3.i.f26356b, "deleteContents", "folder", "getIndentString", "indent", "", "guessFileName", "url", "ext", "isValidUrl", "", "printDirectoryTree", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "printFile", "readSerializable", "T", "(Ljava/io/File;)Ljava/lang/Object;", "readString", "size", "", "writeSerializable", "serializable", "Ljava/io/Serializable;", "writeString", "content", "ObjectInputStreamProvider", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class FileUtility {
    private static final String TAG = "FileUtility";
    public static final FileUtility INSTANCE = new FileUtility();
    private static ObjectInputStreamProvider objectInputStreamProvider = new ObjectInputStreamProvider() { // from class: com.vungle.ads.internal.util.FileUtility$$ExternalSyntheticLambda0
        @Override // com.vungle.ads.internal.util.FileUtility.ObjectInputStreamProvider
        public final ObjectInputStream provideObjectInputStream(InputStream inputStream) {
            return FileUtility.m44862objectInputStreamProvider$lambda0(inputStream);
        }
    };
    private static final List<Class<?>> allowedClasses = CollectionsKt.listOf((Object[]) new Class[]{LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class});

    /* JADX INFO: compiled from: FileUtility.kt */
    @Metadata(m43474d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m43475d2 = {"Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;", "", "provideObjectInputStream", "Ljava/io/ObjectInputStream;", "inputStream", "Ljava/io/InputStream;", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
    public interface ObjectInputStreamProvider {
        ObjectInputStream provideObjectInputStream(InputStream inputStream) throws IOException, ClassNotFoundException;
    }

    private FileUtility() {
    }

    @JvmStatic
    public static final void delete(File f, Set<String> excludeFiles) {
        if (f != null) {
            try {
                if (f.exists()) {
                    if (f.isDirectory()) {
                        if (excludeFiles != null && excludeFiles.contains(f.getName())) {
                            Logger.INSTANCE.m43467d(TAG, "Skipping deletion of directory: " + f.getName());
                            return;
                        }
                        deleteContents(f, excludeFiles);
                    }
                    if (excludeFiles != null && excludeFiles.contains(f.getName())) {
                        Logger.INSTANCE.m43467d(TAG, "Skipping deletion of file: " + f.getName());
                        return;
                    }
                    if (f.delete()) {
                        return;
                    }
                    Logger.INSTANCE.m43467d(TAG, "Failed to delete file: " + f);
                }
            } catch (Exception e) {
                Logger.INSTANCE.m43468e(TAG, "Failed to delete file: " + e.getLocalizedMessage());
            }
        }
    }

    public static /* synthetic */ void delete$default(File file, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        delete(file, set);
    }

    @JvmStatic
    public static final void deleteAndLogIfFailed(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.delete(file.toPath());
            } else {
                if (file.delete()) {
                    return;
                }
                new AssetFailedToDeleteError("Cannot delete " + file.getName()).logErrorNoReturnValue$vungle_ads_release();
            }
        } catch (Exception e) {
            new AssetFailedToDeleteError("Failed to delete " + file.getName() + " with error :" + e.getMessage()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    @JvmStatic
    public static final void deleteContents(File folder, Set<String> excludeFiles) {
        Intrinsics.checkNotNullParameter(folder, "folder");
        File[] fileArrListFiles = folder.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            delete(file, excludeFiles);
        }
    }

    public static /* synthetic */ void deleteContents$default(File file, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        deleteContents(file, set);
    }

    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }

    private final String getIndentString(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append("|  ");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public static /* synthetic */ String guessFileName$default(FileUtility fileUtility, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return fileUtility.guessFileName(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: objectInputStreamProvider$lambda-0, reason: not valid java name */
    public static final ObjectInputStream m44862objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new SafeObjectInputStream(inputStream, allowedClasses);
    }

    @JvmStatic
    public static final void printDirectoryTree(File folder) {
    }

    private final void printDirectoryTree(File folder, int indent, StringBuilder sb) {
        if (folder == null) {
            return;
        }
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory".toString());
        }
        sb.append(getIndentString(indent));
        sb.append("+--");
        sb.append(folder.getName());
        sb.append("/\n");
        File[] fileArrListFiles = folder.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                printDirectoryTree(file, indent + 1, sb);
            } else {
                Intrinsics.checkNotNullExpressionValue(file, "file");
                printFile(file, indent + 1, sb);
            }
        }
    }

    private final void printFile(File file, int indent, StringBuilder sb) {
        sb.append(getIndentString(indent));
        sb.append("+--");
        sb.append(file.getName());
        sb.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00a9: MOVE (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:39:0x00a9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @JvmStatic
    public static final <T> T readSerializable(File file) {
        Closeable closeable;
        ObjectInputStream objectInputStreamProvideObjectInputStream;
        FileUtility fileUtility;
        ?? r4;
        Intrinsics.checkNotNullParameter(file, "file");
        ?? Exists = file.exists();
        Closeable closeable2 = null;
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                Exists = new FileInputStream(file);
                try {
                    FileUtility fileUtility2 = INSTANCE;
                    objectInputStreamProvideObjectInputStream = objectInputStreamProvider.provideObjectInputStream((InputStream) Exists);
                    try {
                        T t = (T) objectInputStreamProvideObjectInputStream.readObject();
                        fileUtility2.closeQuietly(objectInputStreamProvideObjectInputStream);
                        fileUtility2.closeQuietly((Closeable) Exists);
                        return t;
                    } catch (IOException e) {
                        e = e;
                        Logger.Companion companion = Logger.INSTANCE;
                        fileUtility = INSTANCE;
                        companion.m43468e(TAG, "IOException: " + e.getMessage());
                        r4 = Exists;
                        fileUtility.closeQuietly(objectInputStreamProvideObjectInputStream);
                        fileUtility.closeQuietly((Closeable) r4);
                        try {
                            delete$default(file, null, 2, null);
                        } catch (IOException unused) {
                        }
                        return null;
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        Logger.Companion companion2 = Logger.INSTANCE;
                        fileUtility = INSTANCE;
                        companion2.m43468e(TAG, "ClassNotFoundException: " + e.getMessage());
                        r4 = Exists;
                        fileUtility.closeQuietly(objectInputStreamProvideObjectInputStream);
                        fileUtility.closeQuietly((Closeable) r4);
                        delete$default(file, null, 2, null);
                        return null;
                    } catch (Exception e3) {
                        e = e3;
                        Logger.Companion companion3 = Logger.INSTANCE;
                        fileUtility = INSTANCE;
                        companion3.m43468e(TAG, "cannot read serializable " + e.getMessage());
                        r4 = Exists;
                        fileUtility.closeQuietly(objectInputStreamProvideObjectInputStream);
                        fileUtility.closeQuietly((Closeable) r4);
                        delete$default(file, null, 2, null);
                        return null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (ClassNotFoundException e5) {
                    e = e5;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Exception e6) {
                    e = e6;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    FileUtility fileUtility3 = INSTANCE;
                    fileUtility3.closeQuietly(closeable2);
                    fileUtility3.closeQuietly((Closeable) Exists);
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (ClassNotFoundException e8) {
                e = e8;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (Exception e9) {
                e = e9;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                Exists = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
        }
    }

    @JvmStatic
    public static final void writeSerializable(File file, Serializable serializable) {
        OutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                try {
                    objectOutputStream.writeObject(serializable);
                    objectOutputStream.reset();
                    FileUtility fileUtility = INSTANCE;
                    fileUtility.closeQuietly(objectOutputStream);
                    fileUtility.closeQuietly(fileOutputStream);
                } catch (IOException e) {
                    e = e;
                    outputStream = fileOutputStream;
                    try {
                        Logger.Companion companion = Logger.INSTANCE;
                        FileUtility fileUtility2 = INSTANCE;
                        companion.m43468e(TAG, String.valueOf(e.getMessage()));
                        fileUtility2.closeQuietly(objectOutputStream);
                        fileUtility2.closeQuietly(outputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = outputStream;
                        outputStream = objectOutputStream;
                        FileUtility fileUtility3 = INSTANCE;
                        fileUtility3.closeQuietly(outputStream);
                        fileUtility3.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = objectOutputStream;
                    FileUtility fileUtility4 = INSTANCE;
                    fileUtility4.closeQuietly(outputStream);
                    fileUtility4.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                objectOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                FileUtility fileUtility5 = INSTANCE;
                fileUtility5.closeQuietly(outputStream);
                fileUtility5.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            objectOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final List<Class<?>> getAllowedClasses$vungle_ads_release() {
        return allowedClasses;
    }

    public final ObjectInputStreamProvider getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    public final String guessFileName(String url, String ext) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strGuessFileName = URLUtil.guessFileName(url, null, ext);
        Intrinsics.checkNotNullExpressionValue(strGuessFileName, "guessFileName(url, null, ext)");
        return strGuessFileName;
    }

    public final boolean isValidUrl(String url) {
        try {
            String str = url;
            return (str == null || StringsKt.isBlank(str) || HttpUrl.INSTANCE.parse(url) == null) ? false : true;
        } catch (Throwable unused) {
        }
    }

    public final String readString(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            return FilesKt.readText$default(file, null, 1, null);
        } catch (IOException e) {
            Logger.INSTANCE.m43468e(TAG, "IOException: " + e.getMessage());
            return null;
        } catch (Exception e2) {
            Logger.INSTANCE.m43468e(TAG, "cannot read string " + e2.getMessage());
            return null;
        }
    }

    public final void setObjectInputStreamProvider(ObjectInputStreamProvider objectInputStreamProvider2) {
        Intrinsics.checkNotNullParameter(objectInputStreamProvider2, "<set-?>");
        objectInputStreamProvider = objectInputStreamProvider2;
    }

    public final long size(File file) {
        long size = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            if (!(fileArrListFiles.length == 0)) {
                for (File file2 : fileArrListFiles) {
                    size += size(file2);
                }
            }
        }
        return size;
    }

    public final void writeString(File file, String content) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (content == null) {
            return;
        }
        try {
            FilesKt.writeText(file, content, Charsets.UTF_8);
        } catch (IOException e) {
            Logger.INSTANCE.m43468e(TAG, String.valueOf(e.getMessage()));
        }
    }
}
