package de.christinecoenen.code.zapp.app.mediathek.controller.downloads.revisited

import android.app.PendingIntent
import android.content.Context
import de.christinecoenen.code.zapp.R

class DownloadFailedEventNotification(
	appContext: Context,
	title: String,
	retryIntent: PendingIntent
) : DownloadEventNotification(appContext, title) {

	init {
		notificationBuilder
			.setSmallIcon(R.drawable.ic_warning_white_24dp)
			.setAutoCancel(true)
			.setContentText(appContext.getString(R.string.notification_download_failed))
			.addAction(
				R.drawable.ic_refresh_white_24dp,
				appContext.getString(R.string.menu_retry),
				retryIntent
			)
	}

}
