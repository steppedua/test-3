function anotherFirstFunction(count) {
  console.log('Another first function called with count:', count);
  var result = [];
  for (var i = 0; i < count; i++) {
    result.push('Item ' +i);
  }
  return result;
}