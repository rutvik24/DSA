# DSA in Kotlin

A simple Kotlin practice project for data structures and algorithms.

## What's included

- `src/com/rutvik/binary/BinarySearch.kt`
  - Binary search implementation with example usage in `main()`.
- `src/com/rutvik/linear/LinearSearch.kt`
  - Linear scan examples to count numbers with an even number of digits.

## Project structure

```text
DSA/
|-- LICENSE
|-- README.md
`-- src/
	`-- com/
		`-- rutvik/
			|-- binary/
			|   `-- BinarySearch.kt
			`-- linear/
				`-- LinearSearch.kt
```

## Run examples

From the project root:

```bash
kotlinc src/com/rutvik/binary/BinarySearch.kt -include-runtime -d binary.jar
java -jar binary.jar

kotlinc src/com/rutvik/linear/LinearSearch.kt -include-runtime -d linear.jar
java -jar linear.jar
```

## License

This project is licensed under the MIT License. See `LICENSE` for details.

