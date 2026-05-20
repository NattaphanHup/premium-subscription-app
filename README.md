# Premium Subscription App - Android

A modern Android application for managing monthly subscription payments with Firebase backend and Google Play Billing integration.

## Features

✅ **Google Play Billing Integration** - Handle in-app purchases and subscriptions
✅ **Firebase Authentication** - Secure user login and registration
✅ **Firebase Firestore** - Real-time database for subscriptions and payments
✅ **Push Notifications** - Firebase Cloud Messaging for payment alerts
✅ **Subscription Management** - Create, renew, and cancel subscriptions
✅ **Payment History** - Track all transactions
✅ **Material Design 3** - Modern and responsive UI

## Tech Stack

- **Language**: Java
- **Database**: Firebase Firestore
- **Authentication**: Firebase Authentication
- **Notifications**: Firebase Cloud Messaging (FCM)
- **Payment**: Google Play Billing Library v6+
- **UI Framework**: Material Design 3
- **Build System**: Gradle

## Prerequisites

- Android Studio (latest version)
- Android SDK 21 (or higher)
- Firebase Account (free tier)
- Google Play Developer Account (for testing)
- Java 11+

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/premiumapp/
│   │   │   ├── activity/          # UI Activities
│   │   │   ├── service/           # Business logic services
│   │   │   ├── model/             # Data models
│   │   │   ├── adapter/           # RecyclerView adapters
│   │   │   ├── util/              # Utility classes
│   │   │   └── MainActivity.java   # Entry point
│   │   ├── res/
│   │   │   ├── layout/            # UI layouts
│   │   │   ├── values/            # Strings, colors, styles
│   │   │   └── drawable/          # Images and vectors
│   │   └── AndroidManifest.xml
│   ├── test/                       # Unit tests
│   └── androidTest/                # Instrumentation tests
├── build.gradle                    # App-level configuration
└── proguard-rules.pro             # Obfuscation rules
```

## Setup Instructions

### 1. Clone Repository
```bash
git clone https://github.com/NattaphanHup/premium-subscription-app.git
cd premium-subscription-app
```

### 2. Firebase Configuration

1. Go to [Firebase Console](https://console.firebase.google.com/)
2. Create a new project
3. Enable these services:
   - Authentication (Email/Password)
   - Firestore Database
   - Cloud Messaging
4. Download `google-services.json`
5. Place it in `app/` folder

### 3. Google Play Billing Setup

1. Create an app in [Google Play Console](https://play.google.com/console)
2. Set up subscription products:
   - Basic Plan: $0.99/month
   - Premium Plan: $4.99/month
   - Pro Plan: $9.99/month
3. Add test users for billing testing

### 4. Build & Run

```bash
# Open in Android Studio or build from command line
./gradlew clean build
./gradlew installDebug
```

## API Reference

### BillingService
Handles Google Play billing and subscription purchases.

```java
BillingService billingService = new BillingService(context);
billingService.startConnection();
billingService.launchBillingFlow(skuDetails);
```

### SubscriptionService
Manages subscription data and user subscriptions.

```java
SubscriptionService subscriptionService = new SubscriptionService();
subscriptionService.getUserSubscriptions(userId);
subscriptionService.cancelSubscription(subscriptionId);
```

### NotificationService
Handles push notifications for payment alerts.

```java
NotificationService notificationService = new NotificationService();
notificationService.sendPaymentReminder(userId, amount);
```

## Free Tier Limits

- **Firebase**: 50k reads, 20k writes, 20k deletes per day
- **Firestore**: 1GB storage
- **FCM**: Unlimited push notifications
- **Google Play**: No cost for testing

## Testing

### Unit Tests
```bash
./gradlew test
```

### Instrumentation Tests
```bash
./gradlew connectedAndroidTest
```

## Deployment

1. Build signed APK/AAB in Android Studio
2. Upload to Google Play Console
3. Follow store review guidelines
4. Deploy gradually with staged rollout

## Troubleshooting

### Build Errors
- Ensure `google-services.json` is in `app/` folder
- Run `./gradlew clean` and rebuild
- Check Android SDK version compatibility

### Firebase Connection Issues
- Verify Firebase project is linked correctly
- Check internet permissions in AndroidManifest.xml
- Ensure SHA-1 fingerprint is registered in Firebase

### Billing Issues
- Use test accounts from Google Play Console
- Check billing library version compatibility
- Review Google Play Billing documentation

## Contributing

Contributions are welcome! Please:
1. Fork the repository
2. Create feature branch (`git checkout -b feature/amazing-feature`)
3. Commit changes (`git commit -m 'Add amazing feature'`)
4. Push to branch (`git push origin feature/amazing-feature`)
5. Open Pull Request

## License

MIT License - see LICENSE file for details

## Support

For issues and questions:
- Open an issue on GitHub
- Check existing documentation
- Review Firebase & Google Play documentation

## Roadmap

- [ ] Apple subscription support (iOS)
- [ ] Advanced analytics
- [ ] Subscription promotions/discounts
- [ ] Offline support
- [ ] Multi-language support
- [ ] Advanced security features

## Authors

- **Your Name** - Initial work

## Acknowledgments

- Firebase Documentation
- Google Play Billing Library
- Material Design 3
- Android Development Community
