package com.example.depthwall

import android.graphics.Canvas
import android.service.wallpaper.WallpaperService
import android.view.SurfaceHolder

class ParallaxWallpaperService : WallpaperService() {
    override fun onCreateEngine(): Engine {
        return ParallaxWallpaperEngine()
    }

    inner class ParallaxWallpaperEngine : Engine() {
        override fun onCreate(surfaceHolder: SurfaceHolder?) {
            super.onCreate(surfaceHolder)
            // Khởi tạo hiệu ứng chuyển động hình nền ở đây
        }

        override fun onSurfaceDestroyed(holder: SurfaceHolder?) {
            super.onSurfaceDestroyed(holder)
        }

        override fun onOffsetsChanged(
            xOffset: Float,
            yOffset: Float,
            xOffsetStep: Float,
            yOffsetStep: Float,
            xPixelOffset: Int,
            yPixelOffset: Int
        ) {
            super.onOffsetsChanged(
                xOffset,
                yOffset,
                xOffsetStep,
                yOffsetStep,
                xPixelOffset,
                yPixelOffset
            )
            // Xử lý sự kiện dịch chuyển khi người dùng vuốt màn hình chính
        }
    }
}
