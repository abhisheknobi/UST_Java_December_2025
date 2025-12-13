echo "Enter first number:"
read num1
echo "Enter operator (+, -, *, /):"
read op
echo "Enter second number:"
read num2

# Perform calculation directly
result=$(expr $num1 $op $num2)

# Display result
echo "Result: $result"
