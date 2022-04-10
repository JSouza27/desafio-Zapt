function fibonacciSum() {
  const list = [];

  let currentValue = 2;
  let previousValue = 1;

  while(previousValue < 4 * Math.pow(10,6)) {
    currentValue % 2 === 0 && list.push(currentValue);

    currentValue = previousValue + currentValue;
    previousValue = currentValue - previousValue;
  }

  return list.reduce((pValue, cValue) => {
   return pValue + cValue
  }, 0);
}
