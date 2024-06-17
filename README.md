# Lazy Lists in Jetpack Compose

This repository is dedicated to learning and experimenting with lazy lists in Jetpack Compose using Kotlin. The primary focus is on implementing LazyColumn, LazyRow, and LazyGrid within an Android application using Android Studio.

In this repository, I have implemented:

- LazyColumn: A vertically scrolling list.
- LazyRow: A horizontally scrolling list.
- LazyGrid: A grid layout that supports lazy loading of items.

## Features

- LazyColumn: Implementation of a vertically scrolling list that efficiently loads items as they come into view.
- LazyRow: Implementation of a horizontally scrolling list with lazy loading.
- LazyGrid: Implementation of a grid layout that loads items lazily to improve performance.

## Screenshots

<div style="display: flex; justify-content: center; align-items: center;">
    <img src="https://github.com/Bhavyansh03-tech/Lazy_List/assets/96388594/054180dd-ade6-4af1-bae5-d673310d774f" alt="Lazy Row" style="width: 200px; height: auto; margin-right: 10px;">
    <img src="https://github.com/Bhavyansh03-tech/Lazy_List/assets/96388594/f567feb0-b9a7-4c9f-af75-dfe3a86cd1b9" alt="Lazy Column" style="width: 200px; height: auto;">
  <img src="https://github.com/Bhavyansh03-tech/Lazy_List/assets/96388594/4dbdee67-b295-4543-b5f8-6caa92244a2c" alt="Lazy Grid" style="width: 200px; height: auto;">
</div>


## Getting Started

### Installation

1. Clone the repository.

```bash
git clone https://github.com/Bhavyansh03-tech/Lazy_List.git
```

2. Open the project in Android Studio:
- Open Android Studio.
- Click on File -> Open and select the cloned repository folder.

3. Build the project:
- Sync the project with Gradle files.
- Build and run the project on an emulator or physical device.

## Usage

### LazyRow
To use a `LazyRow` in your project, you can follow the implementation in `RowScreen.kt
`:
```kotlin
@Composable
fun RowScreen() {
    LazyRow(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {

        itemsIndexed(ItemsList.itemsData) { _, item ->
            Spacer(modifier = Modifier.width(8.dp))
            RowItem(item = item)
            Spacer(modifier = Modifier.width(8.dp))
        }

    }
}
```

### LazyColumn
To use a `LazyColumn` in your project, you can follow the implementation in `ColumnScreen.kt
`:
```kotlin
@Composable
fun ColumnScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {

        itemsIndexed(ItemsList.itemsData) { _, item ->
            ColumnItem(item = item)
            Spacer(modifier = Modifier.width(8.dp))
        }

    }
}
```

### LazyGrid
To use a `LazyGrid` in your project, you can follow the implementation in `GridScreen.kt
`:
```kotlin
@Composable
fun GridScreen() {
    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        columns = GridCells.Fixed(2) // We can also use adaptive and fixed size grid.
    ) {

        itemsIndexed(ItemsList.itemsData) { _, item ->
            GridItem(item = item)
            Spacer(modifier = Modifier.width(8.dp))
        }

    }
}
```


## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

1.> Fork the Project.\
2.> Create your Feature Branch `git checkout -b feature/AmazingFeature`.\
3.> Commit your Changes `git commit -m 'Add some AmazingFeature'`.\
4.> Push to the Branch `git push origin feature/AmazingFeature`.\
5.> Open a Pull Request

## Acknowledgements

- Inspiration from various Android development tutorials and documentation.
## Contact

For questions or feedback, please contact [@Bhavyansh03-tech](https://github.com/Bhavyansh03-tech).
