package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.unity3d.player.c */
/* JADX INFO: loaded from: classes7.dex */
public final class C14682c {

    /* JADX INFO: renamed from: b */
    private static CameraManager f41676b;

    /* JADX INFO: renamed from: c */
    private static String[] f41677c;

    /* JADX INFO: renamed from: e */
    private static Semaphore f41678e = new Semaphore(1);

    /* JADX INFO: renamed from: a */
    private InterfaceC14684e f41683a;

    /* JADX INFO: renamed from: d */
    private CameraDevice f41684d;

    /* JADX INFO: renamed from: f */
    private HandlerThread f41685f;

    /* JADX INFO: renamed from: g */
    private Handler f41686g;

    /* JADX INFO: renamed from: h */
    private Rect f41687h;

    /* JADX INFO: renamed from: i */
    private Rect f41688i;

    /* JADX INFO: renamed from: j */
    private int f41689j;

    /* JADX INFO: renamed from: k */
    private int f41690k;

    /* JADX INFO: renamed from: n */
    private int f41693n;

    /* JADX INFO: renamed from: o */
    private int f41694o;

    /* JADX INFO: renamed from: q */
    private Range f41696q;

    /* JADX INFO: renamed from: s */
    private Image f41698s;

    /* JADX INFO: renamed from: t */
    private CaptureRequest.Builder f41699t;

    /* JADX INFO: renamed from: w */
    private int f41702w;

    /* JADX INFO: renamed from: x */
    private SurfaceTexture f41703x;

    /* JADX INFO: renamed from: l */
    private float f41691l = -1.0f;

    /* JADX INFO: renamed from: m */
    private float f41692m = -1.0f;

    /* JADX INFO: renamed from: p */
    private boolean f41695p = false;

    /* JADX INFO: renamed from: r */
    private ImageReader f41697r = null;

    /* JADX INFO: renamed from: u */
    private CameraCaptureSession f41700u = null;

    /* JADX INFO: renamed from: v */
    private Object f41701v = new Object();

    /* JADX INFO: renamed from: y */
    private Surface f41704y = null;

    /* JADX INFO: renamed from: z */
    private int f41705z = a.f41713c;

    /* JADX INFO: renamed from: A */
    private CameraCaptureSession.CaptureCallback f41679A = new CameraCaptureSession.CaptureCallback() { // from class: com.unity3d.player.c.1
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            C14682c.this.m43279a(captureRequest.getTag());
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            C14685f.Log(5, "Camera2: Capture session failed " + captureRequest.getTag() + " reason " + captureFailure.getReason());
            C14682c.this.m43279a(captureRequest.getTag());
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        }
    };

    /* JADX INFO: renamed from: B */
    private final CameraDevice.StateCallback f41680B = new CameraDevice.StateCallback() { // from class: com.unity3d.player.c.3
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            C14682c.f41678e.release();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            C14685f.Log(5, "Camera2: CameraDevice disconnected.");
            C14682c.this.m43277a(cameraDevice);
            C14682c.f41678e.release();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
            C14685f.Log(6, "Camera2: Error opeining CameraDevice " + i);
            C14682c.this.m43277a(cameraDevice);
            C14682c.f41678e.release();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            C14682c.this.f41684d = cameraDevice;
            C14682c.f41678e.release();
        }
    };

    /* JADX INFO: renamed from: C */
    private final ImageReader.OnImageAvailableListener f41681C = new ImageReader.OnImageAvailableListener() { // from class: com.unity3d.player.c.4
        @Override // android.media.ImageReader.OnImageAvailableListener
        public final void onImageAvailable(ImageReader imageReader) {
            if (C14682c.f41678e.tryAcquire()) {
                Image imageAcquireNextImage = imageReader.acquireNextImage();
                if (imageAcquireNextImage != null) {
                    Image.Plane[] planes = imageAcquireNextImage.getPlanes();
                    if (imageAcquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                        C14682c.this.f41683a.mo43206a(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                    } else {
                        C14685f.Log(6, "Camera2: Wrong image format.");
                    }
                    if (C14682c.this.f41698s != null) {
                        C14682c.this.f41698s.close();
                    }
                    C14682c.this.f41698s = imageAcquireNextImage;
                }
                C14682c.f41678e.release();
            }
        }
    };

    /* JADX INFO: renamed from: D */
    private final SurfaceTexture.OnFrameAvailableListener f41682D = new SurfaceTexture.OnFrameAvailableListener() { // from class: com.unity3d.player.c.5
        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            C14682c.this.f41683a.mo43205a(surfaceTexture);
        }
    };

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.unity3d.player.c$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public static final int f41711a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f41712b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f41713c = 3;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ int[] f41714d = {1, 2, 3};
    }

    protected C14682c(InterfaceC14684e interfaceC14684e) {
        this.f41683a = null;
        this.f41683a = interfaceC14684e;
        m43295g();
    }

    /* JADX INFO: renamed from: a */
    public static int m43268a(Context context) {
        return m43288c(context).length;
    }

    /* JADX INFO: renamed from: a */
    public static int m43269a(Context context, int i) {
        try {
            return ((Integer) m43281b(context).getCameraCharacteristics(m43288c(context)[i]).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } catch (CameraAccessException e) {
            C14685f.Log(6, "Camera2: CameraAccessException " + e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m43270a(Range[] rangeArr, int i) {
        int i2 = -1;
        double d = Double.MAX_VALUE;
        for (int i3 = 0; i3 < rangeArr.length; i3++) {
            int iIntValue = ((Integer) rangeArr[i3].getLower()).intValue();
            int iIntValue2 = ((Integer) rangeArr[i3].getUpper()).intValue();
            float f = i;
            if (f + 0.1f > iIntValue && f - 0.1f < iIntValue2) {
                return i;
            }
            double dMin = Math.min(Math.abs(i - iIntValue), Math.abs(i - iIntValue2));
            if (dMin < d) {
                i2 = i3;
                d = dMin;
            }
        }
        return ((Integer) (i > ((Integer) rangeArr[i2].getUpper()).intValue() ? rangeArr[i2].getUpper() : rangeArr[i2].getLower())).intValue();
    }

    /* JADX INFO: renamed from: a */
    private static Rect m43271a(Size[] sizeArr, double d, double d2) {
        double d3 = Double.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < sizeArr.length; i3++) {
            int width = sizeArr[i3].getWidth();
            int height = sizeArr[i3].getHeight();
            double dAbs = Math.abs(Math.log(d / ((double) width))) + Math.abs(Math.log(d2 / ((double) height)));
            if (dAbs < d3) {
                i = width;
                i2 = height;
                d3 = dAbs;
            }
        }
        return new Rect(0, 0, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m43277a(CameraDevice cameraDevice) {
        synchronized (this.f41701v) {
            this.f41700u = null;
        }
        cameraDevice.close();
        this.f41684d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m43279a(Object obj) {
        if (obj != "Focus") {
            if (obj == "Cancel focus") {
                synchronized (this.f41701v) {
                    if (this.f41700u != null) {
                        m43301j();
                    }
                }
                return;
            }
            return;
        }
        this.f41695p = false;
        synchronized (this.f41701v) {
            if (this.f41700u != null) {
                try {
                    this.f41699t.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    this.f41699t.setTag("Regular");
                    this.f41700u.setRepeatingRequest(this.f41699t.build(), this.f41679A, this.f41686g);
                } catch (CameraAccessException e) {
                    C14685f.Log(6, "Camera2: CameraAccessException " + e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static Size[] m43280a(CameraCharacteristics cameraCharacteristics) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            C14685f.Log(6, "Camera2: configuration map is not available.");
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        return outputSizes;
    }

    /* JADX INFO: renamed from: b */
    private static CameraManager m43281b(Context context) {
        if (f41676b == null) {
            f41676b = (CameraManager) context.getSystemService("camera");
        }
        return f41676b;
    }

    /* JADX INFO: renamed from: b */
    private void m43283b(CameraCharacteristics cameraCharacteristics) {
        int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
        this.f41690k = iIntValue;
        if (iIntValue > 0) {
            Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            this.f41688i = rect;
            float fWidth = rect.width() / this.f41688i.height();
            float fWidth2 = this.f41687h.width() / this.f41687h.height();
            if (fWidth2 > fWidth) {
                this.f41693n = 0;
                this.f41694o = (int) ((this.f41688i.height() - (this.f41688i.width() / fWidth2)) / 2.0f);
            } else {
                this.f41694o = 0;
                this.f41693n = (int) ((this.f41688i.width() - (this.f41688i.height() * fWidth2)) / 2.0f);
            }
            this.f41689j = Math.min(this.f41688i.width(), this.f41688i.height()) / 20;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m43285b(Context context, int i) {
        try {
            return ((Integer) m43281b(context).getCameraCharacteristics(m43288c(context)[i]).get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
        } catch (CameraAccessException e) {
            C14685f.Log(6, "Camera2: CameraAccessException " + e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m43287c(Context context, int i) {
        try {
            return ((Integer) m43281b(context).getCameraCharacteristics(m43288c(context)[i]).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
        } catch (CameraAccessException e) {
            C14685f.Log(6, "Camera2: CameraAccessException " + e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private static String[] m43288c(Context context) {
        if (f41677c == null) {
            try {
                f41677c = m43281b(context).getCameraIdList();
            } catch (CameraAccessException e) {
                C14685f.Log(6, "Camera2: CameraAccessException " + e);
                f41677c = new String[0];
            }
        }
        return f41677c;
    }

    /* JADX INFO: renamed from: d */
    public static int m43289d(Context context, int i) {
        try {
            CameraCharacteristics cameraCharacteristics = m43281b(context).getCameraCharacteristics(m43288c(context)[i]);
            float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            SizeF sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if (fArr.length > 0) {
                return (int) ((fArr[0] * 36.0f) / sizeF.getWidth());
            }
        } catch (CameraAccessException e) {
            C14685f.Log(6, "Camera2: CameraAccessException " + e);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int[] m43292e(Context context, int i) {
        try {
            Size[] sizeArrM43280a = m43280a(m43281b(context).getCameraCharacteristics(m43288c(context)[i]));
            if (sizeArrM43280a == null) {
                return null;
            }
            int[] iArr = new int[sizeArrM43280a.length * 2];
            for (int i2 = 0; i2 < sizeArrM43280a.length; i2++) {
                int i3 = i2 * 2;
                iArr[i3] = sizeArrM43280a[i2].getWidth();
                iArr[i3 + 1] = sizeArrM43280a[i2].getHeight();
            }
            return iArr;
        } catch (CameraAccessException e) {
            C14685f.Log(6, "Camera2: CameraAccessException " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m43295g() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f41685f = handlerThread;
        handlerThread.start();
        this.f41686g = new Handler(this.f41685f.getLooper());
    }

    /* JADX INFO: renamed from: h */
    private void m43298h() {
        this.f41685f.quit();
        try {
            this.f41685f.join(4000L);
            this.f41685f = null;
            this.f41686g = null;
        } catch (InterruptedException e) {
            this.f41685f.interrupt();
            C14685f.Log(6, "Camera2: Interrupted while waiting for the background thread to finish " + e);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m43300i() {
        try {
            if (!f41678e.tryAcquire(4L, TimeUnit.SECONDS)) {
                C14685f.Log(5, "Camera2: Timeout waiting to lock camera for closing.");
                return;
            }
            this.f41684d.close();
            try {
                if (!f41678e.tryAcquire(4L, TimeUnit.SECONDS)) {
                    C14685f.Log(5, "Camera2: Timeout waiting to close camera.");
                }
            } catch (InterruptedException e) {
                C14685f.Log(6, "Camera2: Interrupted while waiting to close camera " + e);
            }
            this.f41684d = null;
            f41678e.release();
        } catch (InterruptedException e2) {
            C14685f.Log(6, "Camera2: Interrupted while trying to lock camera for closing " + e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m43301j() {
        try {
            if (this.f41690k != 0) {
                float f = this.f41691l;
                if (f >= 0.0f && f <= 1.0f) {
                    float f2 = this.f41692m;
                    if (f2 >= 0.0f && f2 <= 1.0f) {
                        this.f41695p = true;
                        int iWidth = this.f41688i.width();
                        int i = this.f41693n;
                        int i2 = (int) (((iWidth - (i * 2)) * this.f41691l) + i);
                        int iHeight = this.f41688i.height();
                        int i3 = this.f41694o;
                        int i4 = (int) ((((double) (iHeight - (i3 * 2))) * (1.0d - ((double) this.f41692m))) + ((double) i3));
                        int iMax = Math.max(this.f41689j + 1, Math.min(i2, (this.f41688i.width() - this.f41689j) - 1));
                        int iMax2 = Math.max(this.f41689j + 1, Math.min(i4, (this.f41688i.height() - this.f41689j) - 1));
                        CaptureRequest.Builder builder = this.f41699t;
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_REGIONS;
                        int i5 = this.f41689j;
                        builder.set(key, new MeteringRectangle[]{new MeteringRectangle(iMax - i5, iMax2 - i5, i5 * 2, i5 * 2, 999)});
                        this.f41699t.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.f41699t.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.f41699t.setTag("Focus");
                        this.f41700u.capture(this.f41699t.build(), this.f41679A, this.f41686g);
                        return;
                    }
                }
            }
            this.f41699t.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.f41699t.setTag("Regular");
            CameraCaptureSession cameraCaptureSession = this.f41700u;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.setRepeatingRequest(this.f41699t.build(), this.f41679A, this.f41686g);
            }
        } catch (CameraAccessException e) {
            C14685f.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m43302k() {
        try {
            CameraCaptureSession cameraCaptureSession = this.f41700u;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.stopRepeating();
                this.f41699t.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.f41699t.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.f41699t.setTag("Cancel focus");
                this.f41700u.capture(this.f41699t.build(), this.f41679A, this.f41686g);
            }
        } catch (CameraAccessException e) {
            C14685f.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Rect m43303a() {
        return this.f41687h;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m43304a(float f, float f2) {
        if (this.f41690k <= 0) {
            return false;
        }
        if (this.f41695p) {
            C14685f.Log(5, "Camera2: Setting manual focus point already started.");
            return false;
        }
        this.f41691l = f;
        this.f41692m = f2;
        synchronized (this.f41701v) {
            if (this.f41700u != null && this.f41705z != a.f41712b) {
                m43302k();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m43305a(Context context, int i, int i2, int i3, int i4, int i5) {
        try {
            CameraCharacteristics cameraCharacteristics = f41676b.getCameraCharacteristics(m43288c(context)[i]);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                C14685f.Log(5, "Camera2: only LEGACY hardware level is supported.");
                return false;
            }
            Size[] sizeArrM43280a = m43280a(cameraCharacteristics);
            if (sizeArrM43280a != null && sizeArrM43280a.length != 0) {
                this.f41687h = m43271a(sizeArrM43280a, i2, i3);
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null || rangeArr.length == 0) {
                    C14685f.Log(6, "Camera2: target FPS ranges are not avialable.");
                } else {
                    int iM43270a = m43270a(rangeArr, i4);
                    this.f41696q = new Range(Integer.valueOf(iM43270a), Integer.valueOf(iM43270a));
                    try {
                        if (!f41678e.tryAcquire(4L, TimeUnit.SECONDS)) {
                            C14685f.Log(5, "Camera2: Timeout waiting to lock camera for opening.");
                            return false;
                        }
                        try {
                            f41676b.openCamera(m43288c(context)[i], this.f41680B, this.f41686g);
                            try {
                                if (!f41678e.tryAcquire(4L, TimeUnit.SECONDS)) {
                                    C14685f.Log(5, "Camera2: Timeout waiting to open camera.");
                                    return false;
                                }
                                f41678e.release();
                                this.f41702w = i5;
                                m43283b(cameraCharacteristics);
                                return this.f41684d != null;
                            } catch (InterruptedException e) {
                                C14685f.Log(6, "Camera2: Interrupted while waiting to open camera " + e);
                            }
                        } catch (CameraAccessException e2) {
                            C14685f.Log(6, "Camera2: CameraAccessException " + e2);
                            f41678e.release();
                            return false;
                        }
                    } catch (InterruptedException e3) {
                        C14685f.Log(6, "Camera2: Interrupted while trying to lock camera for opening " + e3);
                        return false;
                    }
                }
            }
            return false;
        } catch (CameraAccessException e4) {
            C14685f.Log(6, "Camera2: CameraAccessException " + e4);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m43306b() {
        if (this.f41684d != null) {
            m43309e();
            m43300i();
            this.f41679A = null;
            this.f41704y = null;
            this.f41703x = null;
            Image image = this.f41698s;
            if (image != null) {
                image.close();
                this.f41698s = null;
            }
            ImageReader imageReader = this.f41697r;
            if (imageReader != null) {
                imageReader.close();
                this.f41697r = null;
            }
        }
        m43298h();
    }

    /* JADX INFO: renamed from: c */
    public final void m43307c() {
        if (this.f41697r == null) {
            ImageReader imageReaderNewInstance = ImageReader.newInstance(this.f41687h.width(), this.f41687h.height(), 35, 2);
            this.f41697r = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(this.f41681C, this.f41686g);
            this.f41698s = null;
            if (this.f41702w != 0) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f41702w);
                this.f41703x = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(this.f41687h.width(), this.f41687h.height());
                this.f41703x.setOnFrameAvailableListener(this.f41682D, this.f41686g);
                this.f41704y = new Surface(this.f41703x);
            }
        }
        try {
            if (this.f41700u == null) {
                CameraDevice cameraDevice = this.f41684d;
                Surface surface = this.f41704y;
                cameraDevice.createCaptureSession(surface != null ? Arrays.asList(surface, this.f41697r.getSurface()) : Arrays.asList(this.f41697r.getSurface()), new CameraCaptureSession.StateCallback() { // from class: com.unity3d.player.c.2
                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        C14685f.Log(6, "Camera2: CaptureSession configuration failed.");
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        if (C14682c.this.f41684d == null) {
                            return;
                        }
                        synchronized (C14682c.this.f41701v) {
                            C14682c.this.f41700u = cameraCaptureSession;
                            try {
                                C14682c c14682c = C14682c.this;
                                c14682c.f41699t = c14682c.f41684d.createCaptureRequest(1);
                                if (C14682c.this.f41704y != null) {
                                    C14682c.this.f41699t.addTarget(C14682c.this.f41704y);
                                }
                                C14682c.this.f41699t.addTarget(C14682c.this.f41697r.getSurface());
                                C14682c.this.f41699t.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, C14682c.this.f41696q);
                                C14682c.this.m43301j();
                            } catch (CameraAccessException e) {
                                C14685f.Log(6, "Camera2: CameraAccessException " + e);
                            }
                        }
                    }
                }, this.f41686g);
            } else if (this.f41705z == a.f41712b) {
                this.f41700u.setRepeatingRequest(this.f41699t.build(), this.f41679A, this.f41686g);
            }
            this.f41705z = a.f41711a;
        } catch (CameraAccessException e) {
            C14685f.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m43308d() {
        synchronized (this.f41701v) {
            CameraCaptureSession cameraCaptureSession = this.f41700u;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.stopRepeating();
                    this.f41705z = a.f41712b;
                } catch (CameraAccessException e) {
                    C14685f.Log(6, "Camera2: CameraAccessException " + e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m43309e() {
        synchronized (this.f41701v) {
            CameraCaptureSession cameraCaptureSession = this.f41700u;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.abortCaptures();
                } catch (CameraAccessException e) {
                    C14685f.Log(6, "Camera2: CameraAccessException " + e);
                }
                this.f41700u.close();
                this.f41700u = null;
                this.f41705z = a.f41713c;
            }
        }
    }
}
