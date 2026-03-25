# DSA in Kotlin

Practice implementations of common data structure and algorithm problems in Kotlin.

## Algorithms included

- `src/com/rutvik/binary/BinarySearch.kt`
  - Standard binary search for ascending sorted arrays.
- `src/com/rutvik/binary/OrderAgnosticBinarySearch.kt`
  - Binary search that works for both ascending and descending sorted arrays.
- `src/com/rutvik/linear/LinearSearch.kt`
  - Linear scan examples to count numbers with an even number of digits.

## Project layout

```text
DSA/
|-- LICENSE
|-- README.md
`-- src/com/rutvik/
	|-- binary/
	|   |-- BinarySearch.kt
	|   `-- OrderAgnosticBinarySearch.kt
	`-- linear/
		`-- LinearSearch.kt
```

## Run examples

From the project root, compile and run any file with a `main()` function:

```bash
kotlinc src/com/rutvik/binary/BinarySearch.kt -include-runtime -d binary.jar
java -jar binary.jar

kotlinc src/com/rutvik/binary/OrderAgnosticBinarySearch.kt -include-runtime -d order-agnostic-binary.jar
java -jar order-agnostic-binary.jar

kotlinc src/com/rutvik/linear/LinearSearch.kt -include-runtime -d linear.jar
java -jar linear.jar
```

## Next additions

- More searching and sorting patterns
- Basic array, string, and recursion problems

## License

This project is licensed under the MIT License. See `LICENSE` for details.

